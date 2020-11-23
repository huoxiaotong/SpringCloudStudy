package com.mumu.sdk.service;

import com.mumu.sdk.SdkServerApplicationTest;
import com.mumu.sdk.api.model.Product;
import com.mumu.sdk.api.model.ThirdProductA;
import com.mumu.sdk.api.service.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ThirdProductATest extends SdkServerApplicationTest {

    @Autowired
    ProductService productService;

    @Test
    public void getProduct() {
        ThirdProductA productA = productService.getProduct(ThirdProductA.class, "11");

        System.out.println(productA);
    }
}
