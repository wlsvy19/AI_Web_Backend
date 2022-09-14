package com.egov.ex.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 영업소 목록 정보
 * </p>
 *
 * @author  
 * @since 2022-07-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="영업소 목록 정보", description="")
public class TolofInfo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "본부명")
    private String hdqrNm;
    
    @ApiModelProperty(value = "지사명")
    private String mtnofNm;
    
    @ApiModelProperty(value = "영업소명")
    private String korTolofNm;
    
    @ApiModelProperty(value = "본부 코드")
    private String hdqrCd;
    
    @ApiModelProperty(value = "지사 코드")
    private String mtnofCd;
    
    @ApiModelProperty(value = "영업소 코드")
    private String tolofCd;
    
    @ApiModelProperty(value = "차로 번호")
    private String crgwNo;
    
    @ApiModelProperty(value = "HIPASS/TCS")
    private String crgwTypeCd;
    
    @ApiModelProperty(value = "본부 DB IP")
    private String hdqrDbIp;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getHdqrNm() {
		return hdqrNm;
	}

	public String getMtnofNm() {
		return mtnofNm;
	}

	public String getKorTolofNm() {
		return korTolofNm;
	}

	public String getHdqrCd() {
		return hdqrCd;
	}

	public String getMtnofCd() {
		return mtnofCd;
	}

	public String getTolofCd() {
		return tolofCd;
	}

	public String getCrgwNo() {
		return crgwNo;
	}

	public String getCrgwTypeCd() {
		return crgwTypeCd;
	}

	public String getHdqrDbIp() {
		return hdqrDbIp;
	}    
    
}
