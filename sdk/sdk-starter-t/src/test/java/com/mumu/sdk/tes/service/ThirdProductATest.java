package com.mumu.sdk.tes.service;

import com.mumu.sdk.SdkStaterApplicationTest;
import com.mumu.sdk.api.model.ThirdProductA;
import com.mumu.sdk.api.service.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ThirdProductATest extends SdkStaterApplicationTest {

    @Autowired
    ProductService productService;

    @Test
    public void getProduct() {
        ThirdProductA productA = productService.getProduct(ThirdProductA.class, "11");

        System.out.println(productA);
    }

    @Test
    public void error() {
        productService.error();
    }
}
