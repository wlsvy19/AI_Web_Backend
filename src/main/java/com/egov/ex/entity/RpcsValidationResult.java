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
@ApiModel(value="RpcsValidationResult", description="현재 검증 여부 확인 정보")
public class RpcsValidationResult {

	private static final long serialVersionUID = 1L;
	
    @ApiModelProperty(value = "검증메뉴 ID")
    private int uiId;
    
    @ApiModelProperty(value = "검증 ID")
    private String validatingId;

    @ApiModelProperty(value = "이미지 생성 일자")
    private String imgWorkDate;

    @ApiModelProperty(value = "이미지 생성 순번")
    private String imgWorkNo;
    
    @ApiModelProperty(value = "파일Blob")
    private byte[] imgData;
    
    @ApiModelProperty(value = "재처리 파일Blob")
    private byte[] reprocessingImgData;
    
    @ApiModelProperty(value = "기존 재인식 번호인식 결과")
    private String rpcsNumRecgResult;
    
    @ApiModelProperty(value = "신규 재인식 번호인식 결과")
    private String newNumRecgResult;
    
    @ApiModelProperty(value = "기존 재인식 유형분류 결과")
    private String rpcsTypeRecgResult;
    
    @ApiModelProperty(value = "신규 재인식 유형분류 결과")
    private String newTypeRecgResult;
    
    @ApiModelProperty(value = "번호인식 일치 여부")
    private int isCorrectNum;
    
    @ApiModelProperty(value = "유형분류 일치 여부")
    private int isCorrectType;
    
    @ApiModelProperty(value = "(웹)확인 여부")
    private String prosYn;

	public int getUiId() {
		return uiId;
	}

	public String getValidatingId() {
		return validatingId;
	}
	
	public String getImgWorkDate() {
		return imgWorkDate;
	}

	public String getImgWorkNo() {
		return imgWorkNo;
	}

	public byte[] getImgData() {
		return imgData;
	}
	
	public byte[] getReprocessingImgData() {
		return reprocessingImgData;
	}

	public String getRpcsNumRecgResult() {
		return rpcsNumRecgResult;
	}

	public String getNewNumRecgResult() {
		return newNumRecgResult;
	}

	public String getRpcsTypeRecgResult() {
		return rpcsTypeRecgResult;
	}

	public String getNewTypeRecgResult() {
		return newTypeRecgResult;
	}
	
	public int getIsCorrectNum() {
		return isCorrectNum;
	}

	public int getIsCorrectType() {
		return isCorrectType;
	}

	public String getProsYn() {
		return prosYn;
	}
    
}
