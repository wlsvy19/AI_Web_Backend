package com.egov.ex.util;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.exception.CustomExceptionType;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WebUtil {
    public static void toJsonReponse(HttpServletResponse response,int status, String message) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("application/json");
        response.setStatus(status);
        response.getWriter().write(mapper.writeValueAsString(AjaxResp.error(CustomExceptionType.AUTHORITY_INVALID,message)));
    }
}
