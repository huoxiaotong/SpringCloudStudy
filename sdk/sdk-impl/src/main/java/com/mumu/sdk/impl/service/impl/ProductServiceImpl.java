package com.mumu.sdk.impl.service.impl;


import com.mumu.sdk.SdkException;
import com.mumu.sdk.api.model.Product;
import com.mumu.sdk.api.service.ProductService;
import com.mumu.sdk.common.GenericTypeUtils;
import com.mumu.sdk.impl.service.inner.InnerProductService;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService, InitializingBean {

    private static final String MODEL = "P";
    private @Autowired List<InnerProductService<? extends Product>> services;
    private Map<Class<? extends Product>, InnerProductService<? extends Product>> serviceMap;

    @Override
    public <P extends Product> P getProduct(Class<P> clazz, String code) {

        return this.getInnerExtProduct(clazz).getProduct(code);
    }

    private <P extends Product> InnerProductService<P> getInnerExtProduct(Class<P> clazz) {
       return (InnerProductService<P>) Optional.ofNullable(this.serviceMap.get(clazz)).orElseThrow(() -> new SdkException(""));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.serviceMap = this.services.stream()
                .collect(Collectors.toMap(this::getClazz, Function.identity()));
    }
    private <P extends Product> Class<P> getClazz(InnerProductService<P> service) {
        Class<?> clazz = AopUtils.getTargetClass(service);
        Class<P> pClass = GenericTypeUtils.getActualType(clazz, InnerProductService.class, MODEL);
        return pClass;
    }

}
