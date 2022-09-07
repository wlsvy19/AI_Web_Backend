package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RpcsValidationStatusInfoDto {
	
	private int uiId;
    
	private Character validatingYn;

    private int validatingStep;

    private String validatingId;

    private int progress;
    
    private String weightA;
    
    private String weightB;
    
    private String weightC;
    
    private String weightD;
    
    private String weightE;
    
    private String weightF;
    
    private String hdqrNm;
    
    private String hdqrCd;
        
    private String mtnofNm;
    
    private String mtnofCd;
    
    private String tolofNm;
    
    private String tolofCd;
        
    private Character crgwTypeCd;

    private String crgwNo;

    private String searchWorkDate;

    private String searchStartTime;

    private String searchEndTime;
    
    private Character wantToStop;
    
    private String startDttm;
    
    private String finishDttm;
    
    private String errorMsg;
    
    private int completeCnt;

    private int totalDataCnt;

	public int getUiId() {
		return uiId;
	}

	public void setUiId(int uiId) {
		this.uiId = uiId;
	}

	public Character getValidatingYn() {
		return validatingYn;
	}

	public void setValidatingYn(Character validatingYn) {
		this.validatingYn = validatingYn;
	}

	public int getValidatingStep() {
		return validatingStep;
	}

	public void setValidatingStep(int validatingStep) {
		this.validatingStep = validatingStep;
	}

	public String getValidatingId() {
		return validatingId;
	}

	public void setValidatingId(String validatingId) {
		this.validatingId = validatingId;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public String getWeightA() {
		return weightA;
	}

	public void setWeightA(String weightA) {
		this.weightA = weightA;
	}

	public String getWeightB() {
		return weightB;
	}

	public void setWeightB(String weightB) {
		this.weightB = weightB;
	}

	public String getWeightC() {
		return weightC;
	}

	public void setWeightC(String weightC) {
		this.weightC = weightC;
	}

	public String getWeightD() {
		return weightD;
	}

	public void setWeightD(String weightD) {
		this.weightD = weightD;
	}

	public String getWeightE() {
		return weightE;
	}

	public void setWeightE(String weightE) {
		this.weightE = weightE;
	}

	public String getWeightF() {
		return weightF;
	}

	public void setWeightF(String weightF) {
		this.weightF = weightF;
	}

	public String getHdqrNm() {
		return hdqrNm;
	}

	public void setHdqrNm(String hdqrNm) {
		this.hdqrNm = hdqrNm;
	}

	public String getHdqrCd() {
		return hdqrCd;
	}

	public void setHdqrCd(String hdqrCd) {
		this.hdqrCd = hdqrCd;
	}

	public String getMtnofNm() {
		return mtnofNm;
	}

	public void setMtnofNm(String mtnofNm) {
		this.mtnofNm = mtnofNm;
	}

	public String getMtnofCd() {
		return mtnofCd;
	}

	public void setMtnofCd(String mtnofCd) {
		this.mtnofCd = mtnofCd;
	}

	public String getTolofNm() {
		return tolofNm;
	}

	public void setTolofNm(String tolofNm) {
		this.tolofNm = tolofNm;
	}

	public String getTolofCd() {
		return tolofCd;
	}

	public void setTolofCd(String tolofCd) {
		this.tolofCd = tolofCd;
	}

	public Character getCrgwTypeCd() {
		return crgwTypeCd;
	}

	public void setCrgwTypeCd(Character crgwTypeCd) {
		this.crgwTypeCd = crgwTypeCd;
	}

	public String getCrgwNo() {
		return crgwNo;
	}

	public void setCrgwNo(String crgwNo) {
		this.crgwNo = crgwNo;
	}

	public String getSearchWorkDate() {
		return searchWorkDate;
	}

	public void setSearchWorkDate(String searchWorkDate) {
		this.searchWorkDate = searchWorkDate;
	}

	public String getSearchStartTime() {
		return searchStartTime;
	}

	public void setSearchStartTime(String searchStartTime) {
		this.searchStartTime = searchStartTime;
	}

	public String getSearchEndTime() {
		return searchEndTime;
	}

	public void setSearchEndTime(String searchEndTime) {
		this.searchEndTime = searchEndTime;
	}

	public Character getWantToStop() {
		return wantToStop;
	}

	public void setWantToStop(Character wantToStop) {
		this.wantToStop = wantToStop;
	}

	public String getStartDttm() {
		return startDttm;
	}

	public void setStartDttm(String startDttm) {
		this.startDttm = startDttm;
	}

	public String getFinishDttm() {
		return finishDttm;
	}

	public void setFinishDttm(String finishDttm) {
		this.finishDttm = finishDttm;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public int getCompleteCnt() {
		return completeCnt;
	}

	public void setCompleteCnt(int completeCnt) {
		this.completeCnt = completeCnt;
	}

	public int getTotalDataCnt() {
		return totalDataCnt;
	}

	public void setTotalDataCnt(int totalDataCnt) {
		this.totalDataCnt = totalDataCnt;
	}
    
}
