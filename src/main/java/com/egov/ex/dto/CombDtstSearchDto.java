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
public class CombDtstSearchDto extends Page {
    private String workDate;
    private String combDtstId;
    private String combDtstType;
    private String unitDtstCnt;
    private String totalCnt;

    private String searchDate;
    private String date;
}
