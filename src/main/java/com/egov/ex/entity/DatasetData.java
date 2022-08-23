package com.egov.ex.entity;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 공통 코드 정보
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="DatasetData", description="데이터셋 현황")
public class DatasetData {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "타입")
    private String name;

    @ApiModelProperty(value = "확정데이터 현황")
    private Integer confirmDataCnt;

    @ApiModelProperty(value = "단위데이터셋 기준")
    private Integer stdDatasetCnt;

}
