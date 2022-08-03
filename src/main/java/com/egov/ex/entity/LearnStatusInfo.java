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
    private String trainingYn;

    @ApiModelProperty(value = "학습 진행 단계")
    private String trainingStep;

    @ApiModelProperty(value = "트레이닝 ID")
    private String trainingId;

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
    
    @ApiModelProperty(value = "학습 종료 시간")
    private String finishDttm;
    
    @ApiModelProperty(value = "에러 메세지")
    private String errorMsg;
    
    public String getTrainingId() {
    	return trainingId;
    }

}
