package com.egov.ex.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 가중치
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="WeightInfo", description="가중치")
public class WeightInfo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "생성일시")
    private String workDttm;

    @ApiModelProperty(value = "가중치ID")
    private String weightId;

    @ApiModelProperty(value = "가중치유형")
    private String weightType;

    @ApiModelProperty(value = "배치수")
    private Integer itertaionNo;

    @ApiModelProperty(value = "파일경로")
    private String filePath;

	public String getWorkDate() {
		return workDate;
	}

	public String getWorkDttm() {
		return workDttm;
	}

	public String getWeightId() {
		return weightId;
	}

	public String getWeightType() {
		return weightType;
	}

	public Integer getItertaionNo() {
		return itertaionNo;
	}

	public String getFilePath() {
		return filePath;
	}
        
}
