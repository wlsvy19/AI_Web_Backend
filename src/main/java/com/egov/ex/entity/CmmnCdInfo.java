package com.egov.ex.entity;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 공통 코드 정보
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CmmnCdInfo", description="공통 코드 정보")
public class CmmnCdInfo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "그룹코드")
    private String grpCd;

    @ApiModelProperty(value = "그룹코드명")
    private String grpCdNm;

    @ApiModelProperty(value = "공통코드")
    private String cmmnCd;

    @ApiModelProperty(value = "공통코드명")
    private String cmmnCdNm;

    @ApiModelProperty(value = "데이터유형")
    private String dataType;

    @ApiModelProperty(value = "상위공통코드")
    private String hgrnCmmnCd;

    @ApiModelProperty(value = "조회순서")
    private Integer inqyOrd;

    @ApiModelProperty(value = "최초등록일시")
    private String fsttmRgstDttm;

    @ApiModelProperty(value = "최초등록자ID")
    private String fsttmRgsrId;

    @ApiModelProperty(value = "최종수정일시")
    private String lsttmAltrDttm;

    @ApiModelProperty(value = "최종수정자ID")
    private String lsttmModfrId;

    @ApiModelProperty(value = "코드상세")
    private String cmmnDesc;

	public String getCmmnCd() {
		return cmmnCd;
	}

	public String getCmmnCdNm() {
		return cmmnCdNm;
	}
    
    
}
