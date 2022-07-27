package com.egov.ex.config;

import com.egov.ex.Interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.BeanNameViewResolver;

import java.util.Arrays;
import java.util.List;


@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    private static final long MAX_AGE_SECONDS = 3600;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET","POST","PUT","DELETE")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(MAX_AGE_SECONDS);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> excludePattern= Arrays.asList("/api/user/login"
                ,"/api/user/logout"
                ,"/api/system/user/save"
                ,"/api/user/findPw"
                ,"/api/common/**"
                ,"/css/**"
                ,"/fonts/**"
                ,"/plugin/**"
                ,"/scripts/**");
        registry.addInterceptor(loginInterceptor())
                .addPathPatterns("/api/**")
                .excludePathPatterns(excludePattern);
    }

    @Bean
    public LoginInterceptor loginInterceptor() {
        return new LoginInterceptor();
    }

    @Bean
    public ViewResolver viewResolver() {
        return new BeanNameViewResolver();
    }


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
