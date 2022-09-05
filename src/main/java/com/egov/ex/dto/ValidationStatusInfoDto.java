package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ValidationStatusInfoDto {
	
	private int uiId;
	
    private String validatingId;
    
    private int validatingStep;
    
    private String weightId;

    private String engineType;
    
    private Character dtstType;
    
    private String dtstId;
    
    private int totalDataCnt;

    private String startDttm;
    
	public int getUiId() {
		return uiId;
	}

	public void setUiId(int uiId) {
		this.uiId = uiId;
	}

	public String getValidatingId() {
		return validatingId;
	}

	public void setValidatingId(String validatingId) {
		this.validatingId = validatingId;
	}
	
	public int getValidatingStep() {
		return validatingStep;
	}

	public void setValidatingStep(int validatingStep) {
		this.validatingStep = validatingStep;
	}

	public String getWeightId() {
		return weightId;
	}

	public void setWeightId(String weightId) {
		this.weightId = weightId;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public Character getDtstType() {
		return dtstType;
	}

	public void setDtstType(Character dtstType) {
		this.dtstType = dtstType;
	}
	
	public String getDtstId() {
		return dtstId;
	}

	public void setDtstId(String dtstId) {
		this.dtstId = dtstId;
	}

	public int getTotalDataCnt() {
		return totalDataCnt;
	}

	public void setTotalDataCnt(int totalDataCnt) {
		this.totalDataCnt = totalDataCnt;
	}

	public String getStartDttm() {
		return startDttm;
	}

	public void setStartDttm(String startDttm) {
		this.startDttm = startDttm;
	}
    
}
