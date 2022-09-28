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
	private String searchLabel;
	private String searchNum;
	private String searchChar;
	
    private String date;
    
    private String pageType;
    private String workDate;
    private String workNo;

    private String nmrecgCd;

    private String learnDtstType;

	public String getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(String searchDate) {
		this.searchDate = searchDate;
	}

	public String getSearchLabel() {
		return searchLabel;
	}

	public void setSearchLabel(String searchLabel) {
		this.searchLabel = searchLabel;
	}

	public String getSearchNum() {
		return searchNum;
	}

	public void setSearchNum(String searchNum) {
		this.searchNum = searchNum;
	}

	public String getSearchChar() {
		return searchChar;
	}

	public void setSearchChar(String searchChar) {
		this.searchChar = searchChar;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

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

	public String getNmrecgCd() {
		return nmrecgCd;
	}

	public void setNmrecgCd(String nmrecgCd) {
		this.nmrecgCd = nmrecgCd;
	}

	public String getLearnDtstType() {
		return learnDtstType;
	}

	public void setLearnDtstType(String learnDtstType) {
		this.learnDtstType = learnDtstType;
	}
    
    
}
