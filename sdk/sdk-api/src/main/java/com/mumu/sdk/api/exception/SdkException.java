package com.mumu.sdk.api.exception;

public class SdkException extends RuntimeException {

    public SdkException(String msg) {
        super(msg);
    }

    public SdkException(String msg, Throwable t) {
        super(msg, t);
    }
}
