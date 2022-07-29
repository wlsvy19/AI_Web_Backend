package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UnitDtstSearchDto extends Page {
    private String workDate;
    private String combDtstId;
    private String unitDtstId;
    private String unitDtstType;
    private String totalCnt;

    private String searchDate;
    private String date;
}
