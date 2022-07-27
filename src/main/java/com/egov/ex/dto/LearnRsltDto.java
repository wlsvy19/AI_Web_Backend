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
public class LearnRsltDto {
    private String workDate;
    private String workDttm;
    private String startDttm;
    private String endDttm;
    private String learnDtstId;
    private String learnDtstType;
    private String labelRslt;
    private String imgWorkDate;
    private String imgWorkNo;
    private String engineRslt;
    private String dtrmYn;
    private String dtrmDttm;;
}
