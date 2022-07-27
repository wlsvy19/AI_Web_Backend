package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LabelRsltSaveDto  {
    private String workDate;
    private String workNo;
    private String labelType;
    private String labelDataText;

    private String nmrecgCd;
    private String delYn;
}
