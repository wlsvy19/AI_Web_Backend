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

	private Character trainingYn;

    private int trainingStep;

    private String trainingId;
    
    private int progress;
    
    private String engineType;
    
    private String combDtstId;
     
    private String weightId;
    
    private Character wantToStop;
    
    private String startDttm;
    
    private String remainTime;
    
    private String finishDttm;
    
    private String errorMsg;

	public Character getTrainingYn() {
		return trainingYn;
	}

	public int getTrainingStep() {
		return trainingStep;
	}

	public String getTrainingId() {
		return trainingId;
	}

	public String getEngineType() {
		return engineType;
	}

	public String getCombDtstId() {
		return combDtstId;
	}

	public String getWeightId() {
		return weightId;
	}

	public Character getWantToStop() {
		return wantToStop;
	}

	public String getStartDttm() {
		return startDttm;
	}
	
	public String getRemainTime() {
		return remainTime;
	}

	public String getFinishDttm() {
		return finishDttm;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public int getProgress() {
		return progress;
	}
    
    
}
