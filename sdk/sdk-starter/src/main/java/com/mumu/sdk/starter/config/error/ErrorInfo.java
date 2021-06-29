package com.mumu.sdk.starter.config.error;

import lombok.Data;

@Data
public class ErrorInfo {
    private int status;
    private String error;
    private String message;
    private String path;
}
