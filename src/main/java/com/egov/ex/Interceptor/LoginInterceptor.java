package com.egov.ex.Interceptor;

import com.egov.ex.util.AppConfig;
import com.egov.ex.util.CookieUtils;
import com.egov.ex.util.TokenUtils;
import com.egov.ex.util.WebUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static javax.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;

@Slf4j
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Resource
    private TokenUtils tokenUtils;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String accessToken = CookieUtils.getCookieValue(request, AppConfig.ACCESS_TOKEN);
        boolean accessVerify = tokenUtils.isValidToken(accessToken);
        if (!accessVerify) {
             WebUtil.toJsonReponse(response, SC_UNAUTHORIZED, "token invalid");
             return false;
        }
        int loginUserNo = tokenUtils.getAccessTokenUserNo(accessToken);
        request.setAttribute(AppConfig.LOGIN_SESS, loginUserNo);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

}
