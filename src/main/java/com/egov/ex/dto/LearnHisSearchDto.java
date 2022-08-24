package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LearnHisSearchDto extends Page {
    private String combDtstType;
    private String startDate;
    private String endDate;
    private String ordfield;
    private String order;
	public String getCombDtstType() {
		return combDtstType;
	}
	public void setCombDtstType(String combDtstType) {
		this.combDtstType = combDtstType;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getOrdfield() {
		return ordfield;
	}
	public void setOrdfield(String ordfield) {
		this.ordfield = ordfield;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
    
}
