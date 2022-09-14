package com.egov.ex.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TolofInfoDto extends Page {
	
    private String hdqrNm;
    
    private String mtnofNm;
    
    private String korTolofNm;
    
    private String hdqrCd;
    
    private String mtnofCd;
    
    private String tolofCd;
    
    private String crgwNo;
    
    private String crgwTypeCd;
    
    private String hdqrDbIp;

	public String getHdqrNm() {
		return hdqrNm;
	}

	public void setHdqrNm(String hdqrNm) {
		this.hdqrNm = hdqrNm;
	}

	public String getMtnofNm() {
		return mtnofNm;
	}

	public void setMtnofNm(String mtnofNm) {
		this.mtnofNm = mtnofNm;
	}

	public String getKorTolofNm() {
		return korTolofNm;
	}

	public void setKorTolofNm(String korTolofNm) {
		this.korTolofNm = korTolofNm;
	}

	public String getHdqrCd() {
		return hdqrCd;
	}

	public void setHdqrCd(String hdqrCd) {
		this.hdqrCd = hdqrCd;
	}

	public String getMtnofCd() {
		return mtnofCd;
	}

	public void setMtnofCd(String mtnofCd) {
		this.mtnofCd = mtnofCd;
	}

	public String getTolofCd() {
		return tolofCd;
	}

	public void setTolofCd(String tolofCd) {
		this.tolofCd = tolofCd;
	}

	public String getCrgwNo() {
		return crgwNo;
	}

	public void setCrgwNo(String crgwNo) {
		this.crgwNo = crgwNo;
	}

	public String getCrgwTypeCd() {
		return crgwTypeCd;
	}

	public void setCrgwTypeCd(String crgwTypeCd) {
		this.crgwTypeCd = crgwTypeCd;
	}

	public String getHdqrDbIp() {
		return hdqrDbIp;
	}

	public void setHdqrDbIp(String hdqrDbIp) {
		this.hdqrDbIp = hdqrDbIp;
	}
    
    
}
