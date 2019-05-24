package com.idyoudo.springboot.springbootevent.ApplicationFailedEventPackage;

public class IdyoudoException extends RuntimeException {
    public IdyoudoException() { }

    public IdyoudoException(String message) {
        super(message);
    }

    public IdyoudoException(String message, Throwable cause) {
        super(message, cause);
    }

    public IdyoudoException(Throwable cause) {
        super(cause);
    }

    public IdyoudoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
