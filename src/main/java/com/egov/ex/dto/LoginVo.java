package com.egov.ex.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotEmpty;


@Data
public class LoginVo {

    @ApiModelProperty(value="아이디", required = true, dataType = "String", example = "계정")
    @NotEmpty(message="아이디를 입력하세요.")
    private String loginId;

    @ApiModelProperty(value="비밀번호", required = true, dataType = "String", example = "비번")
    @NotEmpty(message="비밀번호를 입력하세요.")
    private String loginPwd;
}
