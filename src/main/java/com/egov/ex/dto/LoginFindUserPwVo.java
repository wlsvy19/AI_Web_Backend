package com.egov.ex.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginFindUserPwVo {
    @ApiModelProperty(value="이름", required = true, dataType = "String", example = "홍길동")
    @NotEmpty(message="이름을 입력하세요.")
    private String userNm;

    @ApiModelProperty(value="아이디", required = true, dataType = "String", example = "test")
    @NotEmpty(message="아이디를 입력하세요.")
    private String loginId;

    @ApiModelProperty(value="email", required = true, dataType = "String", example = "aa@aa.com")
    @NotEmpty(message="이메일을 입력하세요.")
    private String email;
}
