package com.mumu.sdk.api.service;

import com.mumu.sdk.api.model.Product;

public interface ProductService {

    <P extends Product> P getProduct(Class<P> clazz, String code);
}
