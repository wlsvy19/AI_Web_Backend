package com.egov.ex.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 서버 상태 모니터링
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ServerStatus对象", description="서버 상태 모니터링")
public class ServerStatus {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "생성일시")
    private String workDttm;

    @ApiModelProperty(value = "CPU사용률")
    private String cpuUsageRate;

    @ApiModelProperty(value = "CPU온도")
    private String cpuTemp;

    @ApiModelProperty(value = "메모리크기")
    private String memSize;

    @ApiModelProperty(value = "메모리사용량")
    private String memUsage;

    @ApiModelProperty(value = "메모리사용률")
    private String memUsageRate;

    @ApiModelProperty(value = "디스크크기")
    private String diskSize;

    @ApiModelProperty(value = "디스크사용량")
    private String diskUsage;

    @ApiModelProperty(value = "디스크사용률")
    private String diskUsageRate;

    @ApiModelProperty(value = "GPU크기")
    private String gpuSize;

    @ApiModelProperty(value = "GPU사용량")
    private String gpuUsage;

    @ApiModelProperty(value = "GPU사용률")
    private String gpuUsageRate;



}
