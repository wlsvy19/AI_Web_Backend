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
@ApiModel(value="RpcsValidationStatusInfo", description="현재 검증 여부 확인 정보")
public class RpcsValidationStatusInfo {

    @ApiModelProperty(value = "검증메뉴 ID")
    private int uiId;
    
    @ApiModelProperty(value = "현재 검증 진행 여부")
    private Character validatingYn;

    @ApiModelProperty(value = "검증 진행 단계")
    private int validatingStep;

    @ApiModelProperty(value = "검증 ID")
    private String validatingId;

    @ApiModelProperty(value = "검증 단계별 진행 상황")
    private int progress;
    
    @ApiModelProperty(value = "번호판 탐색 가중치")
    private String weightA;
    
    @ApiModelProperty(value = "문자/숫자1 가중치")
    private String weightB;
    
    @ApiModelProperty(value = "문자/숫자2 가중치")
    private String weightC;
    
    @ApiModelProperty(value = "문자/숫자3 가중치")
    private String weightD;
    
    @ApiModelProperty(value = "꺾임/훼손 가중치")
    private String weightE;
    
    @ApiModelProperty(value = "빛반사/비차량 가중치")
    private String weightF;
    
    @ApiModelProperty(value = "본부 이름")
    private String hdqrNm;
    
    @ApiModelProperty(value = "본부 코드")
    private String hdqrCd;
        
    @ApiModelProperty(value = "지사 이름")
    private String mtnofNm;
    
    @ApiModelProperty(value = "지사 코드")
    private String mtnofCd;
    
    @ApiModelProperty(value = "영업소 이름")
    private String tolofNm;
    
    @ApiModelProperty(value = "영업소 코드")
    private String tolofCd;
        
    @ApiModelProperty(value = "차로 타입")
    private Character crgwTypeCd;

    @ApiModelProperty(value = "차로 번호")
    private String crgwNo;

    @ApiModelProperty(value = "검색할 영업소 본부 DB IP")
    private String hdqrDbIp;
    
    @ApiModelProperty(value = "검색 일자")
    private String searchWorkDate;

    @ApiModelProperty(value = "검색 시작 시간")
    private String searchStartTime;

    @ApiModelProperty(value = "검색 종료 시간")
    private String searchEndTime;
    
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

	public int getUiId() {
		return uiId;
	}

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

	public String getWeightA() {
		return weightA;
	}

	public String getWeightB() {
		return weightB;
	}

	public String getWeightC() {
		return weightC;
	}

	public String getWeightD() {
		return weightD;
	}

	public String getWeightE() {
		return weightE;
	}

	public String getWeightF() {
		return weightF;
	}

	public String getHdqrNm() {
		return hdqrNm;
	}

	public String getHdqrCd() {
		return hdqrCd;
	}

	public String getMtnofNm() {
		return mtnofNm;
	}

	public String getMtnofCd() {
		return mtnofCd;
	}

	public String getTolofNm() {
		return tolofNm;
	}

	public String getTolofCd() {
		return tolofCd;
	}

	public Character getCrgwTypeCd() {
		return crgwTypeCd;
	}

	public String getCrgwNo() {
		return crgwNo;
	}
	
	public String getHdqrDbIp() {
		return hdqrDbIp;
	}

	public String getSearchWorkDate() {
		return searchWorkDate;
	}

	public String getSearchStartTime() {
		return searchStartTime;
	}

	public String getSearchEndTime() {
		return searchEndTime;
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
