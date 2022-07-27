package com.egov.ex.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 학습결과
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="LearnRslt", description="학습결과")
public class LearnRslt  {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "생성일시")
    private String workDttm;

    @ApiModelProperty(value = "학습시작시간")
    private String startDttm;

    @ApiModelProperty(value = "학습종료시간")
    private String endDttm;

    @ApiModelProperty(value = "학습데이터셋ID")
    private String learnDtstId;

    @ApiModelProperty(value = "학습데이터유형")
    private String learnDtstType;

    @ApiModelProperty(value = "라벨링데이터")
    private String labelRslt;

    @ApiModelProperty(value = "영상이미지생성일자")
    private String imgWorkDate;

    @ApiModelProperty(value = "영상이미지생성순번")
    private String imgWorkNo;

    @ApiModelProperty(value = "엔진결과데이터")
    private String engineRslt;

    @ApiModelProperty(value = "확정유무")
    private String dtrmYn;

    @ApiModelProperty(value = "확정일시")
    private String dtrmDttm;

}
