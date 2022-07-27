package com.egov.ex.exception;

import com.egov.ex.dto.AjaxResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Map;

@Slf4j
@Component
@ControllerAdvice
public class GlobalReponseAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter,
                                  MediaType mediaType, Class aClass,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        if (mediaType.equalsTypeAndSubtype(
                MediaType.APPLICATION_JSON))
            if (body instanceof AjaxResp) {
                serverHttpResponse.setStatusCode(HttpStatus.valueOf(
                        ((AjaxResp)body).getCode()));
                        return body;

            } else if(body instanceof Map) {

                Object c = ((Map)body).get("status");
                String errMsg = "error";

                if(((Map)body).get("message") != null) {
                    errMsg = ((Map)body).get("message").toString();
                }

                if(c != null ) {
                    int code = Integer.parseInt(c.toString());
                    if(code <= 400 && code <= 500) {
                        body = AjaxResp.error(CustomExceptionType.USER_INPUT_ERROR, errMsg);
                    }
                    else if(code <= 400 && code <= 500) {
                        body = AjaxResp.error(CustomExceptionType.SYSTEM_ERROR, errMsg);
                    }
                }
                System.err.println(errMsg);
                return body;
            }
        return body;
    }
}
