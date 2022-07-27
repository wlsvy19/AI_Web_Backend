package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LearnStatusDto {
    private String workDate;
    private String learnDtstId;
    private String learnDtstType;
    private String weightId;

}
