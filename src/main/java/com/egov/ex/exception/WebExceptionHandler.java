package com.egov.ex.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.egov.ex.dto.AjaxResp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class WebExceptionHandler {
    //@ModelView를 controller위에 단것만 처리(view는 page에 만들어 주어야 함)
    @ExceptionHandler(ModelViewException.class)
    public ModelAndView viewExceptionHandler(HttpServletRequest req, ModelViewException e) {
        try {
            e.printStackTrace();
        }catch (Exception ex) {
            log.error(e.getMessage());
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e);
        modelAndView.addObject("url", req.getRequestURL());
        modelAndView.setViewName("error");

        return modelAndView;
    }


    //验证voField
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public AjaxResp handleBindException(MethodArgumentNotValidException e) {
        try {
            e.printStackTrace();
        }catch (Exception ex) {
            log.error(e.getMessage());
        }
        FieldError fieldError = e.getBindingResult().getFieldError();
        return AjaxResp.error(
                new CustomException(
                        CustomExceptionType.USER_INPUT_ERROR,
                        fieldError.getDefaultMessage()));
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public AjaxResp handleBindException(BindException e) {
        try {
            e.printStackTrace();
        }catch (Exception ex) {
            log.error(e.getMessage());
        }
        FieldError fieldError = e.getBindingResult().getFieldError();
        return AjaxResp.error(new CustomException(
                CustomExceptionType.USER_INPUT_ERROR,
                fieldError.getDefaultMessage()));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public AjaxResp handleBindException(IllegalArgumentException e) {
        try {
            e.printStackTrace();
        }catch (Exception ex) {
            log.error(e.getMessage());
        }
        return AjaxResp.error(
                new CustomException(
                        CustomExceptionType.USER_INPUT_ERROR,
                        e.getMessage()));
    }

    //处理业务逻辑异常
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public AjaxResp customerException(CustomException e) {
        if(e.getCode() == CustomExceptionType.SYSTEM_ERROR.getCode()) {
            // 将异常信息持久化处理， 方便运维人员处理
            try {
                e.printStackTrace();
            }catch (Exception ex) {
                log.error(e.getMessage());
            }
        }
        return AjaxResp.error(e);
    }

    //处理程序员遗漏的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public AjaxResp exception(Exception e) {
        //TODO 异常信息持久化处理，方便运维人员处理
        try {
            e.printStackTrace();
        }catch (Exception ex) {
            log.error(e.getMessage());
        }
        return AjaxResp.error(new CustomException(
                CustomExceptionType.OTHER_ERROR));
    }
}
