package com.egov.ex.dto;

import lombok.Data;

@Data
public class UserTokenVo {
    private String accessToken;
    // private String refreshToken;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
}
