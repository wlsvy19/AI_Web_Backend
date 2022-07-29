package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CrgwImgDataSaveData {
    private String pageType;
    private String workDate;
    private String workNo;
    private String nmrecgCd;
    private String dtrmYn;

    private String delYn;
    private String prosYn;

}
