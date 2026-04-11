package com.distributed.common.exception;

public class BusinessException extends RuntimeException{
    public BusinessException(String message){
        super(message);
    }

    public BusinessException(String message, Throwable cause){
        super(message, cause);
    }

    public BusinessException(String errorCode, String message, Throwable cause){
        super(errorCode+" : "+message, cause);
    }
}
