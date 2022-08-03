package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LearnStatusInfoDto {

	private String trainingYn;

    private String trainingStep;

    private String trainingId;

    private String engineType;
    
    private String combDtstId;
     
    private String weightId;
    
    private Character wantToStop;
    
    private String startDttm;
    
    private String finishDttm;
    
    private String errorMsg;
    
    public void setTrainingId(String id) {
    	trainingId = id;
    }
    
    public String getTrainingId() {
    	return trainingId; 
    }
}
