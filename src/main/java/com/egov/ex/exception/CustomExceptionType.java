package com.egov.ex.exception;

public enum CustomExceptionType {

    MESSAGE(200,""),
    USER_INPUT_ERROR(400,"입력 오류 혹은 권한이 없습니다."),
    AUTHORITY_INVALID(401, "토큰 만료 되었습니다."),
    AUTH_ERROR(403, "해당 권한이 없습니다."),
    SYSTEM_ERROR(500, "시스템 오류，관리자를 연락하시기 바랍니다."),
    TOOKEN_ERROR(600, "토큰 만료 되었습니다."),
    OTHER_ERROR(900, "시스템 오류");

    private String desc;

    private int code;

    CustomExceptionType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
