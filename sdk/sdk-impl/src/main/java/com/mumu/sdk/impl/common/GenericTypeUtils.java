package com.mumu.sdk.impl.common;

import com.mumu.sdk.api.exception.SdkException;
import org.apache.commons.lang3.reflect.TypeUtils;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class GenericTypeUtils {

    private GenericTypeUtils() {
        throw new SdkException("..........!");
    }

    public static <T> Class<T>  getActualType(Class<?> sourceClass, Class<?> defineClass, String name) {
        System.out.println("sourceClass:"+sourceClass);
        System.out.println("defineClass:"+defineClass);
        System.out.println("name:"+name);
        return (Class<T>) findActualType(sourceClass, defineClass, name).orElseThrow(() -> new SdkException("bucunzai"));

    }

    private static <T> Optional<Class<T>> findActualType(Class<?> sourceClass, Class<?> defineClass, String name) {
        return findActualType0(sourceClass, defineClass, name);
    }

    private static <T> Optional<Class<T>> findActualType0(Class<?> sourceClass, Class<?> defineClass, String name) {
        Map<TypeVariable<?>, Type> map = TypeUtils.getTypeArguments(sourceClass, defineClass);
        if (Objects.isNull(map)) {
            return Optional.empty();
        }

        return map.entrySet().stream()
                .filter( entry -> entry.getKey().getGenericDeclaration() == defineClass)
                .filter(entry -> entry.getKey().getName().equals(name))
                .findAny()
                .map(entry -> (Class<T>) entry.getValue());
    }
}
