package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ValidationResultDto {

	private String uiId;
	
    private String validatingId;
    
    private String imgWorkDate;
    
    private String imgWorkNo;
    
    private Character engineType;

    private String labelJson;
    
    private int offset;

    private String isCorrect;
    
    private String prosYn;
    
	public String getUiId() {
		return uiId;
	}

	public void setUiId(String uiId) {
		this.uiId = uiId;
	}

	public String getValidatingId() {
		return validatingId;
	}

	public void setValidatingId(String validatingId) {
		this.validatingId = validatingId;
	}

	public String getImgWorkDate() {
		return imgWorkDate;
	}

	public void setImgWorkDate(String imgWorkDate) {
		this.imgWorkDate = imgWorkDate;
	}

	public String getImgWorkNo() {
		return imgWorkNo;
	}

	public void setImgWorkNo(String imgWorkNo) {
		this.imgWorkNo = imgWorkNo;
	}

	public Character getEngineType() {
		return engineType;
	}

	public void setEngineType(Character engineType) {
		this.engineType = engineType;
	}

	public String getLabelJson() {
		return labelJson;
	}

	public void setLabelJson(String labelJson) {
		this.labelJson = labelJson;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(String isCorrect) {
		this.isCorrect = isCorrect;
	}

	public String getProsYn() {
		return prosYn;
	}

	public void setProsYn(String prosYn) {
		this.prosYn = prosYn;
	}
    
}
