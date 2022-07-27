package com.egov.ex.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class AppConfig {

    public final static String DEV = "dev";
    public final static String LOCAL = "local";
    public final static String PROD = "prod";

    public static final long PAGE_CUR_SIZE = 20;

    @Value("${spring.profiles.active}")
    private String proifle;

    @Value("${security.token.subject}")
    private String tokenSubject;

    @Value("${security.token.key}")
    private String tokenSecretKey;

    @Value("${security.token.expiration}")
    private String tokenExpiration;

    @Value("${file.basedir}")
    private  String uploadDir;

    public static final String REQUEST_SUCCESS_MESSAGE = "요청성공";

    public static final String dateTimeFormat= "yyyy-MM-dd HH:mm:ss";
    public static final String dateTimeFormatT= "yyyy-MM-dd'T'HH:mm:ss";
    public static final String dateTImeTimeZone = "Asia/Seoul";
    public static final String dateFormat = "yyyy-MM-dd";
    public static final String LOGIN_SESS = "LOGIN_SESS";
    public static final String ACCESS_TOKEN =  "ails-auth-token";
    public static final String REFRESH_TOKEN = "RefreshToken";
    public static final String SWAGGER_PACKAGE = "com.egov.ex";
    public static final String SESSSION_ERROR_CNT= "SESSSION_ERROR_CNT";

}
