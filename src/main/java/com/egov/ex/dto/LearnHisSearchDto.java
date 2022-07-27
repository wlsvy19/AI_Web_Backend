package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LearnHisSearchDto extends Page {
    private String combDtstType;
    private String startDate;
    private String endDate;
    private String ordfield;
    private String order;
}
