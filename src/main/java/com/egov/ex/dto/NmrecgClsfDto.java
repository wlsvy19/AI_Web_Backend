package com.egov.ex.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class NmrecgClsfDto {
    private String workDate;
    private String workNo;
    private String dtrmNmrecgCd;
    private String labelType;
    private String dtrmDttm;
    private String occpYn;
    private String occpDttm;
}
