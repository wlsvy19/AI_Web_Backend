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
public class SearchLabelRsltDto  {

	private String pageType;
    
    private String workDate;

    private String workNo;

    private String labelType;

    private String labelDataText;    

    private String unitDtstInclYn;

    private String unitDtstInclDttm;

    private String unitDtstId;

    private String dtrmYn;

    private String dtrmDttm;

    private String labelJson;

	public String getPageType() {
		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public String getWorkNo() {
		return workNo;
	}

	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

	public String getLabelType() {
		return labelType;
	}

	public void setLabelType(String labelType) {
		this.labelType = labelType;
	}

	public String getLabelDataText() {
		return labelDataText;
	}

	public void setLabelDataText(String labelDataText) {
		this.labelDataText = labelDataText;
	}

	public String getUnitDtstInclYn() {
		return unitDtstInclYn;
	}

	public void setUnitDtstInclYn(String unitDtstInclYn) {
		this.unitDtstInclYn = unitDtstInclYn;
	}

	public String getUnitDtstInclDttm() {
		return unitDtstInclDttm;
	}

	public void setUnitDtstInclDttm(String unitDtstInclDttm) {
		this.unitDtstInclDttm = unitDtstInclDttm;
	}

	public String getUnitDtstId() {
		return unitDtstId;
	}

	public void setUnitDtstId(String unitDtstId) {
		this.unitDtstId = unitDtstId;
	}

	public String getDtrmYn() {
		return dtrmYn;
	}

	public void setDtrmYn(String dtrmYn) {
		this.dtrmYn = dtrmYn;
	}

	public String getDtrmDttm() {
		return dtrmDttm;
	}

	public void setDtrmDttm(String dtrmDttm) {
		this.dtrmDttm = dtrmDttm;
	}

	public String getLabelJson() {
		return labelJson;
	}

	public void setLabelJson(String labelJson) {
		this.labelJson = labelJson;
	}
    
}
