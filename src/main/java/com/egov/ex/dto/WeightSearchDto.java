package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WeightSearchDto extends Page {
    private String pageType;
    
    private String weightType;
    
    private String weightId;

    private String filePath;
    
	public String getPageType() {
		return pageType;
	}

	public String getWeightType() {
		return weightType;
	}
	
	public String getWeightId() {
		return weightId;
	}	
	
	public String getfilePath() {
		return filePath;
	}	
}
