package com.egov.ex.config;

import com.egov.ex.util.AppConfig;
import com.google.common.base.Predicates;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${spring.profiles.active}")
    private String active;

//    @Value("${domain}")
    private String domain;

    @Bean
    public Docket api() {
        Docket docket =  new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage(AppConfig.SWAGGER_PACKAGE))
                .paths(PathSelectors.ant("/api/**"))
//                .paths(Predicates.not(PathSelectors.ant("/api/system/**")))
//                .paths(Predicates.not(PathSelectors.ant("/api/code/**")))
//                .paths(Predicates.not(PathSelectors.ant("/api/common/**")))
                .build()
                .apiInfo(metaData())
                .securityContexts(Arrays.asList(securityContext()))
                .securitySchemes(Arrays.asList(apiKey()));
        if("prod".equals(active)) {
            // docket.host(domain);
        }
        return docket;

    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("Ails-Admin REST API")
                .description("ails for ex")
                .version("0.1.0")
                .termsOfServiceUrl("Terms of service")
                .contact(new Contact("admin@ails.co.kr", "https://www.ails.co.kr", "admin@ails.co.kr"))
//                .license("Apache License Version 2.0")
//                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .build();
    }

    private ApiKey apiKey() {
        return new ApiKey("JWT", AppConfig.ACCESS_TOKEN, "header");
    }

    private SecurityContext securityContext() {
        return springfox
                .documentation
                .spi.service
                .contexts
                .SecurityContext
                .builder()
                .securityReferences(defaultAuth()).forPaths(PathSelectors.any()).build();
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Arrays.asList(new SecurityReference("JWT", authorizationScopes));
    }
}
