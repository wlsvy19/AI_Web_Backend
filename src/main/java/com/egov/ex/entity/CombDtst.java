package com.egov.ex.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 통합 데이터셋
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CombDtst", description="통합 데이터셋")
public class CombDtst {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "생성일시")
    private String workDttm;

    @ApiModelProperty(value = "통합데이터셋ID")
    private String combDtstId;

    @ApiModelProperty(value = "통합데이터셋유형")
    private String combDtstType;

    @ApiModelProperty(value = "총데이터수")
    private Integer totalCnt;

    @ApiModelProperty(value = "검증유무")
    private String dtrmYn;

    @ApiModelProperty(value = "검증일시")
    private String dtrmDttm;



}
