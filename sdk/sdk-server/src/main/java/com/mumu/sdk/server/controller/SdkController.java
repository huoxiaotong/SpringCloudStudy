package com.mumu.sdk.server.controller;

import com.mumu.sdk.api.model.Product;
import com.mumu.sdk.api.model.ThirdProductA;
import com.mumu.sdk.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class SdkController extends BaseController {


    @Autowired
    ProductService productService;
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public <P extends Product> ResponseEntity<P> getProduct(@PathVariable String code, String clazz) {

        P product = (P) productService.getProduct(ThirdProductA.class, code);

        return returnWithClassHealder(product);
    }
}
