package com.mumu.sdk.server.controller;

import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class BaseController {
    protected final static int STATUS = 200;
    protected final static String CLAZZ = "clazz";

    protected <T>ResponseEntity<T> returnWithClassHealder(T t) {
        String className = Optional.ofNullable(t)
                .map(obj -> {
                    return obj.getClass().getName();
                }).orElse(null);

        return ResponseEntity.status(STATUS).header(CLAZZ).body(t);
    }

}
