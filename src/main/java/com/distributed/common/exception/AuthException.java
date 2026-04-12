package com.distributed.common.exception;

public class AuthException extends RuntimeException{
    public AuthException(String message){
        super(message);
    }

    public AuthException(String message, Throwable cause){
        super(message, cause);
    }

    public AuthException(String errorCode, String message, Throwable cause){
        super(errorCode+" : "+message, cause);
    }
}
