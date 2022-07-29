package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CrgwImgDataSearchData extends Page{
	private String searchDate;
    private String date;
    
    private String pageType;
    private String workDate;
    private String workNo;

    private String nmrecgCd;

    private String learnDtstType;
}
