package com.distributed.common.exception;

public class ValidationException extends RuntimeException{
    public ValidationException(String message){
        super(message);
    }

    public ValidationException(String message, Throwable cause){
        super(message,cause);
    }

    public ValidationException(String errorCode, String message, Throwable cause){
        super(errorCode+" : "+message, cause);
    }
}
