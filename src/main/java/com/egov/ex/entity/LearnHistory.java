package com.egov.ex.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 학습이력
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="LearnHistory", description="학습이력")
public class LearnHistory  {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "트레이닝 ID")
    private String trainingId;

    @ApiModelProperty(value = "학습시작시간")
    private String startDttm;

    @ApiModelProperty(value = "학습종료시간")
    private String endDttm;

    @ApiModelProperty(value = "학습데이터셋ID")
    private String learnDtstId;

    @ApiModelProperty(value = "학습데이터유형")
    private String learnDtstType;

    @ApiModelProperty(value = "학습데이터개수")
    private Integer learnDtstCnt;

    @ApiModelProperty(value = "Base가중치")
    private String baseWeight;

    @ApiModelProperty(value = "mAP")
    private String map;

    @ApiModelProperty(value = "Best가중치")
    private String bestWeight;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTrainingId() {
		return trainingId;
	}
	
	public String getStartDttm() {
		return startDttm;
	}

	public String getEndDttm() {
		return endDttm;
	}

	public String getLearnDtstId() {
		return learnDtstId;
	}

	public String getLearnDtstType() {
		return learnDtstType;
	}

	public Integer getLearnDtstCnt() {
		return learnDtstCnt;
	}

	public String getBaseWeight() {
		return baseWeight;
	}

	public String getMap() {
		return map;
	}

	public String getBestWeight() {
		return bestWeight;
	}
    
    
}
