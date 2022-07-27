package com.egov.ex.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 알고리즘
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AlgoInfo", description="알고리즘")
public class AlgoInfo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "버전")
    private String algoVer;

    @ApiModelProperty(value = "번호판탐색가중치ID")
    private String plateWeightId;

    @ApiModelProperty(value = "문자/숫자1가중치ID")
    private String word1WeightId;

    @ApiModelProperty(value = "문자/숫자2가중치ID")
    private String word2WeightId;

    @ApiModelProperty(value = "문자/숫자3가중치ID")
    private String word3WeightId;

    @ApiModelProperty(value = "꺾임/훼손가중치ID")
    private String incnWeightId;

    @ApiModelProperty(value = "스미어,비차량가중치ID")
    private String smbrWeightId;

    @ApiModelProperty(value = "적용유무")
    private String applyYn;

    @ApiModelProperty(value = "적용일시")
    private String applyDttm;

}
