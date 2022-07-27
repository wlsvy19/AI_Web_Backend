package com.egov.ex.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 학습 상태 모니터링
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="LearnStatus对象", description="학습 상태 모니터링")
public class LearnStatus {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "시작시간")
    private String startDttm;

    @ApiModelProperty(value = "남은시간(예상)")
    private String remainDttm;

    @ApiModelProperty(value = "완료시간")
    private String endDttm;

    @ApiModelProperty(value = "완료유무")
    private String endYn;

    @ApiModelProperty(value = "학습데이터셋ID")
    private String learnDtstId;

    @ApiModelProperty(value = "학습데이터유형")
    private String learnDtstType;

    @ApiModelProperty(value = "학습Loss율0")
    private String lossRate0;

    @ApiModelProperty(value = "mAP값0")
    private String mapValue0;

    @ApiModelProperty(value = "학습Loss율1")
    private String lossRate1;

    @ApiModelProperty(value = "mAP값1")
    private String mapValue1;

    @ApiModelProperty(value = "학습Loss율2")
    private String lossRate2;

    @ApiModelProperty(value = "mAP값2")
    private String mapValue2;

    @ApiModelProperty(value = "학습Loss율3")
    private String lossRate3;

    @ApiModelProperty(value = "mAP값3")
    private String mapValue3;

    @ApiModelProperty(value = "학습Loss율4")
    private String lossRate4;

    @ApiModelProperty(value = "mAP값4")
    private String mapValue4;

    @ApiModelProperty(value = "학습Loss율5")
    private String lossRate5;

    @ApiModelProperty(value = "mAP값5")
    private String mapValue5;

    @ApiModelProperty(value = "학습Loss율6")
    private String lossRate6;

    @ApiModelProperty(value = "mAP값6")
    private String mapValue6;

    @ApiModelProperty(value = "학습Loss율7")
    private String lossRate7;

    @ApiModelProperty(value = "mAP값7")
    private String mapValue7;

    @ApiModelProperty(value = "학습Loss율8")
    private String lossRate8;

    @ApiModelProperty(value = "mAP값8")
    private String mapValue8;

    @ApiModelProperty(value = "학습Loss율9")
    private String lossRate9;

    @ApiModelProperty(value = "mAP값9")
    private String mapValue9;

    @ApiModelProperty(value = "학습Loss율10")
    private String lossRate10;

    @ApiModelProperty(value = "mAP값10")
    private String mapValue10;

}
