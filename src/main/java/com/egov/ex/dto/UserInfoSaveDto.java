package com.egov.ex.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserInfoSaveDto{
    @ApiModelProperty(value = "사용자번호")
    private int userNo;

    @ApiModelProperty(value = "사용자아이디")
    private String userId;

    @ApiModelProperty(value = "사용자명")
    private String userNm;

    @ApiModelProperty(value = "패스워드")
    private String userPswd;

    @ApiModelProperty(value = "연락처")
    private String moblNo;

    @ApiModelProperty(value = "권한등급")
    private String gradCd;

	public int getUserNo() {
		return userNo;
	}
    
    
}
