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
    
}
