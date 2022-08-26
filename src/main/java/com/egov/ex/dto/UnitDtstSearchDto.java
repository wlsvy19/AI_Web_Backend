package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UnitDtstSearchDto extends Page {
    private String workDate;
    private String combDtstId;
    private String unitDtstId;
    private String unitDtstType;
    private String totalCnt;
    private String searchDate;
    private String date;
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCombDtstId() {
		return combDtstId;
	}
	public void setCombDtstId(String combDtstId) {
		this.combDtstId = combDtstId;
	}
	public String getUnitDtstId() {
		return unitDtstId;
	}
	public void setUnitDtstId(String unitDtstId) {
		this.unitDtstId = unitDtstId;
	}
	public String getUnitDtstType() {
		return unitDtstType;
	}
	public void setUnitDtstType(String unitDtstType) {
		this.unitDtstType = unitDtstType;
	}
	public String getTotalCnt() {
		return totalCnt;
	}
	public void setTotalCnt(String totalCnt) {
		this.totalCnt = totalCnt;
	}
	public String getSearchDate() {
		return searchDate;
	}
	public void setSearchDate(String searchDate) {
		this.searchDate = searchDate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
    
    
}
