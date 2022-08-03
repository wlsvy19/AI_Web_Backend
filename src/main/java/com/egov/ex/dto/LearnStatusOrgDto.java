package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LearnStatusOrgDto {
    private String workDate;
    private String learnDtstId;
    private String learnDtstType;
    private String weightId;
	public String getWorkDate() {
		return workDate;
	}
	public String getLearnDtstId() {
		return learnDtstId;
	}
	public String getLearnDtstType() {
		return learnDtstType;
	}
	public String getWeightId() {
		return weightId;
	}

}
