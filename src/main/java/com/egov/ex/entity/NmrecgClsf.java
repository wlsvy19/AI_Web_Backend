package com.egov.ex.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 미오인식 유형분류 결과
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="NmrecgClsf对象", description="미오인식 유형분류 결과")
public class NmrecgClsf  {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "생성순번")
    private String workNo;

    @ApiModelProperty(value = "미오인식코드")
    private String nmrecgCd;
    
    @ApiModelProperty(value = "확정미오인식코드")
    private String dtrmNmrecgCd;

    @ApiModelProperty(value = "라벨링유형")
    private String labelType;

    @ApiModelProperty(value = "확정여부")
    private String dtrmYn;
    
    @ApiModelProperty(value = "확정일자")
    private String dtrmDttm;

    @ApiModelProperty(value = "점유여부")
    private String occpYn;

    @ApiModelProperty(value = "점유일시")
    private String occpDttm;

}
