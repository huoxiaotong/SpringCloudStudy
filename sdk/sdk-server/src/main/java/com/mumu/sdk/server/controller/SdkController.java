package com.mumu.sdk.server.controller;

import com.mumu.sdk.api.exception.SdkException;
import com.mumu.sdk.api.model.Product;
import com.mumu.sdk.api.model.ThirdProductA;
import com.mumu.sdk.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class SdkController extends BaseController {


    @Autowired
    ProductService productService;

    @GetMapping(value = "/{code}")
    public <P extends Product> ResponseEntity<P> getProduct(@PathVariable String code,@RequestHeader Class<P> clazz) {

        P product = (P) productService.getProduct(clazz, code);
        return returnWithClassHealder(product);
    }

    @GetMapping(value = "/error")
    public void error() {
        throw new SdkException("错误校验");
    }

}
