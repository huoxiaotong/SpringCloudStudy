package com.mumu.sdk.service;

import com.mumu.sdk.SdkServerApplicationTest;
import com.mumu.sdk.api.model.ThirdProductA;
import com.mumu.sdk.api.model.ThirdProductB;
import com.mumu.sdk.api.service.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ThirdProductBTest extends SdkServerApplicationTest {

    @Autowired
    ProductService productService;

    @Test
    public void getProduct() {
        ThirdProductB productb = productService.getProduct(ThirdProductB.class, "11");

        System.out.println(productb);
    }
}
