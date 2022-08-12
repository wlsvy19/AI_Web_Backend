package com.egov.ex.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 학습 상태 모니터링
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="LearnStatusInfo", description="현재 학습 여부 확인 정보")
public class LearnStatusInfo {

    @ApiModelProperty(value = "현재 학습 진행 여부")
    private Character trainingYn;

    @ApiModelProperty(value = "학습 진행 단계")
    private int trainingStep;

    @ApiModelProperty(value = "트레이닝 ID")
    private String trainingId;

    @ApiModelProperty(value = "학습 단계별 진행 상황")
    private int progress;
    
    @ApiModelProperty(value = "엔진 종류")
    private String engineType;
    
    @ApiModelProperty(value = "통합 데이터셋 ID")
    private String combDtstId;
    
    @ApiModelProperty(value = "가중치 ID")
    private String weightId;
    
    @ApiModelProperty(value = "학습 중지 요청")
    private Character wantToStop;
    
    @ApiModelProperty(value = "학습 시작 시간")
    private String startDttm;
    
    @ApiModelProperty(value = "학습 종료까지 남은 시간")
    private String remainTime;
    
    @ApiModelProperty(value = "학습 종료 시간")
    private String finishDttm;
    
    @ApiModelProperty(value = "에러 메세지")
    private String errorMsg;
    
    public String getTrainingId() {
    	return trainingId;
    }

	public Character getTrainingYn() {
		return trainingYn;
	}

	public int getTrainingStep() {
		return trainingStep;
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
