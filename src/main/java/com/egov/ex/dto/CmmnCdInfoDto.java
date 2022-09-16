package com.egov.ex.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CmmnCdInfoDto {
    
    private String grpCd;

    private String grpCdNm;

    private String cmmnCd;

    private String cmmnCdNm;

    private String dataType;

    private String hgrnCmmnCd;

    private Integer inqyOrd;

    private String fsttmRgstDttm;

    private String fsttmRgsrId;

    private String lsttmAltrDttm;

    private String lsttmModfrId;

    private String cmmnDesc;

	public String getGrpCd() {
		return grpCd;
	}

	public void setGrpCd(String grpCd) {
		this.grpCd = grpCd;
	}

	public String getGrpCdNm() {
		return grpCdNm;
	}

	public void setGrpCdNm(String grpCdNm) {
		this.grpCdNm = grpCdNm;
	}

	public String getCmmnCd() {
		return cmmnCd;
	}

	public void setCmmnCd(String cmmnCd) {
		this.cmmnCd = cmmnCd;
	}

	public String getCmmnCdNm() {
		return cmmnCdNm;
	}

	public void setCmmnCdNm(String cmmnCdNm) {
		this.cmmnCdNm = cmmnCdNm;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getHgrnCmmnCd() {
		return hgrnCmmnCd;
	}

	public void setHgrnCmmnCd(String hgrnCmmnCd) {
		this.hgrnCmmnCd = hgrnCmmnCd;
	}

	public Integer getInqyOrd() {
		return inqyOrd;
	}

	public void setInqyOrd(Integer inqyOrd) {
		this.inqyOrd = inqyOrd;
	}

	public String getFsttmRgstDttm() {
		return fsttmRgstDttm;
	}

	public void setFsttmRgstDttm(String fsttmRgstDttm) {
		this.fsttmRgstDttm = fsttmRgstDttm;
	}

	public String getFsttmRgsrId() {
		return fsttmRgsrId;
	}

	public void setFsttmRgsrId(String fsttmRgsrId) {
		this.fsttmRgsrId = fsttmRgsrId;
	}

	public String getLsttmAltrDttm() {
		return lsttmAltrDttm;
	}

	public void setLsttmAltrDttm(String lsttmAltrDttm) {
		this.lsttmAltrDttm = lsttmAltrDttm;
	}

	public String getLsttmModfrId() {
		return lsttmModfrId;
	}

	public void setLsttmModfrId(String lsttmModfrId) {
		this.lsttmModfrId = lsttmModfrId;
	}

	public String getCmmnDesc() {
		return cmmnDesc;
	}

	public void setCmmnDesc(String cmmnDesc) {
		this.cmmnDesc = cmmnDesc;
	}
        
}
