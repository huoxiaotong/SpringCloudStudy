package com.mumu.sdk.impl.service.inner;

import com.mumu.sdk.api.model.Product;

public interface InnerProductService<P extends Product> {

    P getProduct(String code);
}
