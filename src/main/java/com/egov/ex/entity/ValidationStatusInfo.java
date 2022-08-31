package com.egov.ex.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 검증 상태 모니터링
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ValidationStatusInfo", description="현재 검증 여부 확인 정보")
public class ValidationStatusInfo {

    @ApiModelProperty(value = "현재 검증 진행 여부")
    private Character validatingYn;

    @ApiModelProperty(value = "검증 진행 단계")
    private int validatingStep;

    @ApiModelProperty(value = "검증 ID")
    private String validatingId;

    @ApiModelProperty(value = "검증 단계별 진행 상황")
    private int progress;
    
    @ApiModelProperty(value = "엔진 종류")
    private String engineType;
    
    @ApiModelProperty(value = "데이터셋 타입")
    private Character dtstType;
    
    @ApiModelProperty(value = "데이터셋 ID")
    private String dtstId;
    
    @ApiModelProperty(value = "가중치 ID")
    private String weightId;
    
    @ApiModelProperty(value = "검증 중지 요청")
    private Character wantToStop;
    
    @ApiModelProperty(value = "검증 시작 시간")
    private String startDttm;
    
    @ApiModelProperty(value = "검증 종료 시간")
    private String finishDttm;
    
    @ApiModelProperty(value = "에러 메세지")
    private String errorMsg;
    
    @ApiModelProperty(value = "처리 데이터 갯수")
    private int completeCnt;

    @ApiModelProperty(value = "해당 데이터 갯수")
    private int totalDataCnt;

	public Character getValidatingYn() {
		return validatingYn;
	}

	public int getValidatingStep() {
		return validatingStep;
	}

	public String getValidatingId() {
		return validatingId;
	}

	public int getProgress() {
		return progress;
	}

	public String getEngineType() {
		return engineType;
	}

	public Character getDtstType() {
		return dtstType;
	}

	public String getDtstId() {
		return dtstId;
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

	public String getFinishDttm() {
		return finishDttm;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public int getCompleteCnt() {
		return completeCnt;
	}

	public int getTotalDataCnt() {
		return totalDataCnt;
	}
    
}
