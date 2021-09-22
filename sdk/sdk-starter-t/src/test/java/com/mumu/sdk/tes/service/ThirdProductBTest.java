package com.mumu.sdk.tes.service;

import com.mumu.sdk.SdkStaterApplicationTest;
import com.mumu.sdk.api.model.ThirdProductB;
import com.mumu.sdk.api.service.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ThirdProductBTest extends SdkStaterApplicationTest {

    @Autowired
    ProductService productService;

    @Test
    public void getProduct() {
        ThirdProductB productb = productService.getProduct(ThirdProductB.class, "111");

        System.out.println(productb);
    }
}
