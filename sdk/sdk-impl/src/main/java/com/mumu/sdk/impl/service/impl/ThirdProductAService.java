package com.mumu.sdk.impl.service.impl;

import com.mumu.sdk.api.model.Product;
import com.mumu.sdk.api.model.ThirdProductA;
import com.mumu.sdk.impl.entity.ThirdProductEnA;
import com.mumu.sdk.impl.service.inner.BaseInnerProductServiceImpl;
import com.mumu.sdk.impl.service.inner.InnerProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ThirdProductAService extends BaseInnerProductServiceImpl<ThirdProductA, ThirdProductEnA> {

    private static final String MODEL = "M";
    private @Autowired List<InnerProductService<? extends Product>> services;
    private Map<Class<? extends Product>, InnerProductService<? extends Product>> serviceMap;


}
