package com.egov.ex.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 사용자 정보
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UserInfo", description="사용자 정보")
public class UserInfo  {

	private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "사용자번호")
    private int userNo;

	@ApiModelProperty(value = "사용자아이디")
    private String userId;

    @ApiModelProperty(value = "사용자명")
    private String userNm;

    @JsonIgnore
    @ApiModelProperty(value = "패스워드")
    private String userPswd;

    @ApiModelProperty(value = "연락처")
    private String moblNo;

    @ApiModelProperty(value = "권한등급")
    private String gradCd;

    @ApiModelProperty(value = "최초등록일시")
    private String fsttmRgstDttm;

    @ApiModelProperty(value = "최초등록자ID")
    private String fsttmRgsrId;

    @ApiModelProperty(value = "최종수정일시")
    private String lsttmAltrDttm;

    @ApiModelProperty(value = "최종수정자ID")
    private String lsttmModfrId;

    @ApiModelProperty(value = "토큰")
    private String accessToken;

    public int getUserNo() {
		return userNo;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserNm() {
		return userNm;
	}

	public String getUserPswd() {
		return userPswd;
	}

    public void setUserPswd(String userPswd) {
		this.userPswd = userPswd;
	}

	public void setLsttmAltrDttm(String lsttmAltrDttm) {
		this.lsttmAltrDttm = lsttmAltrDttm;
	}
	
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
}
