package com.egov.ex.dto;

import com.egov.ex.exception.CustomException;
import com.egov.ex.exception.CustomExceptionType;
import com.egov.ex.util.AppConfig;
import lombok.Data;

@Data
public class AjaxResp {

    private boolean isok;

    private int code;

    private String message;

    private Object data;

    public boolean isIsok() {
        return isok;
    }

    public static final String LOGIN_PW_ERROR = "입력하신 로그인 정보가 일치하지 않습니다.";
    private AjaxResp() {}

    public static AjaxResp error(CustomException e) {
        AjaxResp resultBean = new AjaxResp();
        resultBean.setIsok(false);
        resultBean.setCode(e.getCode());
        resultBean.setMessage(e.getMessage());
        return resultBean;
    }

    public static AjaxResp error(CustomExceptionType customExceptionType, String errorMessage) {
        AjaxResp resultBean = new AjaxResp();
        resultBean.setIsok(false);
        resultBean.setCode(customExceptionType.getCode());
        resultBean.setMessage(errorMessage);
        return resultBean;
    }

    public static AjaxResp success() {
        AjaxResp ajaxResponse = new AjaxResp();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(AppConfig.REQUEST_SUCCESS_MESSAGE);
        return ajaxResponse;
    }

    public static AjaxResp success(Object obj) {
        AjaxResp ajaxResponse = new AjaxResp();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(AppConfig.REQUEST_SUCCESS_MESSAGE);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }

    public static AjaxResp success(Object obj, String message) {
        AjaxResp ajaxResponse = new AjaxResp();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }

    public static AjaxResp error(Object obj, String message) {
        AjaxResp ajaxResponse = new AjaxResp();
        ajaxResponse.setIsok(false);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }

}
