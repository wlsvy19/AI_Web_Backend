package com.egov.ex.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 단위 데이터셋
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UnitDtst", description="단위 데이터셋")
public class UnitDtst  {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "생성일시")
    private String workDttm;

    @ApiModelProperty(value = "단위데이터셋ID")
    private String unitDtstId;

    @ApiModelProperty(value = "단위데이터셋유형")
    private String unitDtstType;

    @ApiModelProperty(value = "총데이터수")
    private Integer totalCnt;

    @ApiModelProperty(value = "통합데이터셋포함유무")
    private String combDtstInclYn;

    @ApiModelProperty(value = "통합데이터셋포함일시")
    private String combDtstInclDttm;

    @ApiModelProperty(value = "통합데이터셋ID")
    private String combDtstId;

    @ApiModelProperty(value = "검증유무")
    private String dtrmYn;

    @ApiModelProperty(value = "검증일시")
    private String dtrmDttm;

	public String getWorkDate() {
		return workDate;
	}

	public String getWorkDttm() {
		return workDttm;
	}

	public String getUnitDtstId() {
		return unitDtstId;
	}

	public String getUnitDtstType() {
		return unitDtstType;
	}

	public Integer getTotalCnt() {
		return totalCnt;
	}

	public String getCombDtstInclYn() {
		return combDtstInclYn;
	}

	public String getCombDtstInclDttm() {
		return combDtstInclDttm;
	}

	public String getCombDtstId() {
		return combDtstId;
	}

	public String getDtrmYn() {
		return dtrmYn;
	}

	public String getDtrmDttm() {
		return dtrmDttm;
	}
    
}
