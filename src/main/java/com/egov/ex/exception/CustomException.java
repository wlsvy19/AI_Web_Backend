package com.egov.ex.exception;

public class CustomException extends RuntimeException {

    private int code;

    private String message;

    private CustomException() {}

    public CustomException(CustomExceptionType exceptionTypeEnum) {
        this.code = exceptionTypeEnum.getCode();
        this.message = exceptionTypeEnum.getDesc();
    }
    public CustomException(String message) {
        this.code = CustomExceptionType.SYSTEM_ERROR.getCode();
        this.message = message;
    }
    public CustomException(CustomExceptionType exceptionTypeEnum, String message) {
        this.code = exceptionTypeEnum.getCode();
        this.message = message;
    }
    public CustomException(int code , String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
