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
public class RpcsValidationResultDto extends Page {
	
    private int uiId;
    
    private String validatingId;

    private String imgWorkDate;

    private String imgWorkNo;

    private byte[] imgData;
    
    private byte[] reprocessingImgData;
    
    private String rpcsNumRecgResult;
    
    private String newNumRecgResult;
    
    private String rpcsTypeRecgResult;
    
    private String newTypeRecgResult;
    
    private int isCorrectNum;
    
    private int isCorrectType;

    private String prosYn;

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

	public byte[] getImgData() {
		return imgData;
	}
	
	public byte[] getReprocessingImgData() {
		return reprocessingImgData;
	}

	public void setReprocessingImgData(byte[] reprocessingImgData) {
		this.reprocessingImgData = reprocessingImgData;
	}

	public void setImgData(byte[] imgData) {
		this.imgData = imgData;
	}

	public String getRpcsNumRecgResult() {
		return rpcsNumRecgResult;
	}

	public void setRpcsNumRecgResult(String rpcsNumRecgResult) {
		this.rpcsNumRecgResult = rpcsNumRecgResult;
	}

	public String getNewNumRecgResult() {
		return newNumRecgResult;
	}

	public void setNewNumRecgResult(String newNumRecgResult) {
		this.newNumRecgResult = newNumRecgResult;
	}

	public String getRpcsTypeRecgResult() {
		return rpcsTypeRecgResult;
	}

	public void setRpcsTypeRecgResult(String rpcsTypeRecgResult) {
		this.rpcsTypeRecgResult = rpcsTypeRecgResult;
	}

	public String getNewTypeRecgResult() {
		return newTypeRecgResult;
	}

	public void setNewTypeRecgResult(String newTypeRecgResult) {
		this.newTypeRecgResult = newTypeRecgResult;
	}
	
	public int getIsCorrectNum() {
		return isCorrectNum;
	}

	public void setIsCorrectNum(int isCorrectNum) {
		this.isCorrectNum = isCorrectNum;
	}

	public int getIsCorrectType() {
		return isCorrectType;
	}

	public void setIsCorrectType(int isCorrectType) {
		this.isCorrectType = isCorrectType;
	}

	public String getProsYn() {
		return prosYn;
	}

	public void setProsYn(String prosYn) {
		this.prosYn = prosYn;
	}
    
}
