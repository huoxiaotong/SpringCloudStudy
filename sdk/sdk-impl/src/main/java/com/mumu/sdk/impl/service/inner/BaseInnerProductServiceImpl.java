package com.mumu.sdk.impl.service.inner;

import com.mumu.sdk.api.model.Product;
import com.mumu.sdk.impl.common.GenericTypeUtils;
import com.mumu.sdk.impl.entity.ProductEn;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeanUtils;

public class BaseInnerProductServiceImpl<P extends Product, E extends ProductEn> implements InnerProductService<P> {
    private static final String MODEL = "P";
    private static final String ENTITY = "E";

    private Class<P> modelClass;
    private Class<E> entityClass;

    @Override
    public P getProduct(String code) {
        P product = BeanUtils.instantiateClass(this.modelClass);
        product.setCode(code);
        return product;
    }






    protected BaseInnerProductServiceImpl() {
        this.initTypeParam();
    }

    private void initTypeParam() {
        Class<?> clazz = AopUtils.getTargetClass(this);
        this.modelClass = GenericTypeUtils.getActualType(clazz, BaseInnerProductServiceImpl.class, MODEL);
        this.entityClass = GenericTypeUtils.getActualType(clazz, BaseInnerProductServiceImpl.class, ENTITY);
    }




}
