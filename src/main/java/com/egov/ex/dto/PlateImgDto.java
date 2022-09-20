package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PlateImgDto extends Page {
	
    private String workDate;

    private String workNo;

    private String labelType;

    private String fileNm;

    private String filePath;

	public String getWorkDate() {
		return workDate;
	}

	public String getWorkNo() {
		return workNo;
	}

	public String getLabelType() {
		return labelType;
	}

	public String getFileNm() {
		return fileNm;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

	public void setLabelType(String labelType) {
		this.labelType = labelType;
	}

	public void setFileNm(String fileNm) {
		this.fileNm = fileNm;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
    
}
