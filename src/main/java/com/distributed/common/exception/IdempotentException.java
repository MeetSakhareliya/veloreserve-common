package com.distributed.common.exception;

public class IdempotentException extends RuntimeException{
    public IdempotentException(String message){
        super(message);
    }

    public IdempotentException(String message, Throwable cause){
        super(message, cause);
    }

    public IdempotentException(String errorCode, String message, Throwable cause){
        super(errorCode+" : "+message, cause);
    }
}
