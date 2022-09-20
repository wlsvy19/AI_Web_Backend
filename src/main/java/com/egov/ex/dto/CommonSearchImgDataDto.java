package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CommonSearchImgDataDto {
   
	public CommonSearchImgDataDto(ValidationResultDto param) {
		this.workDate = param.getImgWorkDate();
		this.workNo = param.getImgWorkNo();
		this.labelType = param.getEngineType();		
		this.delYn = param.getDelYn();
	}

	private String workDate;
    
    private String workNo;
    
    private Character labelType;
    
    private Character delYn;
    
    private Character prosYn;

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

	public Character getLabelType() {
		return labelType;
	}

	public void setLabelType(Character labelType) {
		this.labelType = labelType;
	}

	public Character getDelYn() {
		return delYn;
	}

	public void setDelYn(Character delYn) {
		this.delYn = delYn;
	}

	public Character getProsYn() {
		return prosYn;
	}

	public void setProsYn(Character prosYn) {
		this.prosYn = prosYn;
	}
        
}
