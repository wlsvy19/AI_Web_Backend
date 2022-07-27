package com.egov.ex.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserInfoDelDto {
    @ApiModelProperty(value = "사용자번호")
    private int userNo;
}
