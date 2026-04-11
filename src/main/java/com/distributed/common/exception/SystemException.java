package com.distributed.common.exception;

public class SystemException extends RuntimeException{
    public SystemException(String message){
        super(message);
    }

    public SystemException(String message, Throwable cause){
        super(message, cause);
    }

    public SystemException(String errorCode, String message, Throwable cause){
        super(errorCode+" : "+message, cause);
    }

}
