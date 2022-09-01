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

    private String validatingId;
    
    private String imgWorkDate;
    
    private String imgWorkNo;
    
    private String engineType;

    private String labelJson;
    
    private int offset;

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

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
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
    
}
