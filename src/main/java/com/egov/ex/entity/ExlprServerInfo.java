package com.egov.ex.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 신규엔진 배포 서버
 * </p>
 *
 * @author  
 * @since 2022-07-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="신규엔지 배포 서버", description="")
public class ExlprServerInfo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "본부")
    private String hdqrNm;
    @ApiModelProperty(value = "번호")
    private String exlprNum;
    @ApiModelProperty(value = "IP부소")
    private String vmNm;
    @ApiModelProperty(value = "IP주소")
    private String vmIp;
    @ApiModelProperty(value = "현재 가중치 버전")
    private String crntWeightVer;
    @ApiModelProperty(value = "최종 업데이트 일자")
    private String updateDttm;
    @ApiModelProperty(value = "업데이트 상태")
    private String updateYn;

}
