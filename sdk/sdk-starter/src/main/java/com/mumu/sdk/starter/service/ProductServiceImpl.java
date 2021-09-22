package com.mumu.sdk.starter.service;

import com.mumu.sdk.api.model.Product;
import com.mumu.sdk.api.service.ProductService;
import com.mumu.sdk.starter.feign.SdkFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl extends BaseServiceImpl implements ProductService {

    @Autowired
    SdkFeignService service;

    @Override
    public <P extends Product> P getProduct(Class<P> clazz, String code) {
        Optional<P> optional = this.invokeFeign(() -> this.service.getProduct(code,clazz.getName()),clazz);
        return optional.orElse(null);
    }

    @Override
    public void error() {
        this.service.error();
    }
}
