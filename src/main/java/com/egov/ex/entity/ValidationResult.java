package com.egov.ex.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 학습이력
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ValidationResult", description="검증 결과")
public class ValidationResult  {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "검증메뉴 ID")
    private int uiId;
    
    @ApiModelProperty(value = "검증 ID")
    private String validatingID;

    @ApiModelProperty(value = "이미지 생성 일자")
    private String imgWorkDate;

    @ApiModelProperty(value = "이미지 생성 순번")
    private String imgWorkNo;

    @ApiModelProperty(value = "엔진 타입")
    private String engineType;

    @ApiModelProperty(value = "결과 JSON")
    private String labelJson;

    @ApiModelProperty(value = "인식 결과 코드")
    private String result;

    @ApiModelProperty(value = "정답 일치 여부")
    private int isCorrect;
    
    @ApiModelProperty(value = "(웹) 확인 여부")
    private String prosYn;
    
    @ApiModelProperty(value = "(웹) 삭제 여부")
    private String delYn;
    
    @ApiModelProperty(value = "(Join) 정답정보")
    private String answer;

	public int getUiId() {
		return uiId;
	}

	public String getValidatingID() {
		return validatingID;
	}

	public String getImgWorkDate() {
		return imgWorkDate;
	}

	public String getImgWorkNo() {
		return imgWorkNo;
	}

	public String getEngineType() {
		return engineType;
	}

	public String getLabelJson() {
		return labelJson;
	}

	public String getResult() {
		return result;
	}

	public int getIsCorrect() {
		return isCorrect;
	}

	public String getProsYn() {
		return prosYn;
	}
	
	public String getDelYn() {
		return delYn;
	}

	public String getAnswer() {
		return answer;
	}     	
	
}
