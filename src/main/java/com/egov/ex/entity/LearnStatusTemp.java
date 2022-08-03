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
@ApiModel(value="LearnStatusTemp", description="학습 상태 모니터링")
public class LearnStatusTemp {

    @ApiModelProperty(value = "트레이닝 ID")
    private String trainingId;

    @ApiModelProperty(value = "이터레이션")
    private String iteration;

    @ApiModelProperty(value = "Loss율")
    private String lossRate;

    @ApiModelProperty(value = "mAP값")
    private String mapValue;
    
    public String getTrainingId() {
    	return trainingId;
    }

    public String getIteration() {
    	return iteration;
    }
    
    public String getLossRate() {
    	return lossRate;
    }
    
    public String getMapValue() {
    	return mapValue;
    }
}
