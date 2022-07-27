package com.egov.ex.exception;

public class ModelViewException extends RuntimeException{

    public static ModelViewException transfer(Throwable cause) {
        return new ModelViewException(cause);
    }

    private ModelViewException(Throwable cause) { super(cause); }
}
