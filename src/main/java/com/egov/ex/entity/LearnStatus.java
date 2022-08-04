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
@ApiModel(value="LearnStatus", description="학습 상태 모니터링")
public class LearnStatus {

    @ApiModelProperty(value = "트레이닝 ID")
    private String trainingId;

    @ApiModelProperty(value = "이터레이션")
    private int iteration;

    @ApiModelProperty(value = "Loss율")
    private Float lossRate;

    @ApiModelProperty(value = "mAP값")
    private Float mapValue;
    
    public String getTrainingId() {
    	return trainingId;
    }

    public int getIteration() {
    	return iteration;
    }
    
    public Float getLossRate() {
    	return lossRate;
    }
    
    public Float getMapValue() {
    	return mapValue;
    }
}
