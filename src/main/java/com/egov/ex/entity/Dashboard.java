package com.egov.ex.entity;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 상환판 집계
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Dashboard", description="상환판 집계")
public class Dashboard {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "미오인식유형분류건수")
    private Integer nmrecgCnt;

    @ApiModelProperty(value = "미오인식유형분류용량(KB)")
    private Long nmrecgSize;

    @ApiModelProperty(value = "학습데이터건수")
    private Integer learnCnt;

    @ApiModelProperty(value = "학습데이터용량(KB)")
    private Long learnSize;

    @ApiModelProperty(value = "학습결과건수")
    private Integer learnRsltCnt;

    @ApiModelProperty(value = "학습결과검증률")
    private String learnRsltRate;

    @ApiModelProperty(value = "알고리즘버전")
    private String algoVer;

    @ApiModelProperty(value = "알고리즘업데이트일자")
    private String algoRfltDate;

    @ApiModelProperty(value = "단차로인식률전")
    private String singleRecgRateBefore;

    @ApiModelProperty(value = "단차로인식률후")
    private String singleRecgRateAfter;

    @ApiModelProperty(value = "다차로인식률전")
    private String multiRecgRateBefore;

    @ApiModelProperty(value = "다차로인식률후")
    private String multiRecgRateAfter;

    @ApiModelProperty(value = "전면인식률전")
    private String frsdRecgRateBefore;

    @ApiModelProperty(value = "전면인식률후")
    private String frsdRecgRateAfter;

    @ApiModelProperty(value = "후면인식률전")
    private String bksdRecgRateBefore;

    @ApiModelProperty(value = "후면인식률후")
    private String bksdRecgRateAfter;



}
