package com.egov.ex.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 차로 영상 데이터
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CrgwImgData", description="차로 영상 데이터")
public class CrgwImgData {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "생성순번")
    private String workNo;

    @ApiModelProperty(value = "촬영일시")
    private String shootDttm;

    @ApiModelProperty(value = "영업소명")
    private String tolofNm;

    @ApiModelProperty(value = "차로번호")
    private String crgwNo;

    @ApiModelProperty(value = "차로인식차량번호")
    private String crgwVhno;

    @ApiModelProperty(value = "재인식차량번호")
    private String rpcsVhno;

    @ApiModelProperty(value = "미인식코드")
    private String nmrecgCd;
    
    @ApiModelProperty(value = "확정미인식코드")
    private String dtrmNmrecgCd;

    @ApiModelProperty(value = "라벨링 데이터")
    private String labelDataText;

    @ApiModelProperty(value = "확정유무")
    private String dtrmYn;

    @ApiModelProperty(value = "확정일시")
    private String dtrmDttm;
    
    @ApiModelProperty(value = "처리유무")
    private String prosYn;

    @ApiModelProperty(value = "처리일시")
    private String prosDttm;

    @ApiModelProperty(value = "이미지 data")
    private String imageData;

    @ApiModelProperty(value = "삭제여부")
    private String delYn;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getWorkDate() {
		return workDate;
	}

	public String getWorkNo() {
		return workNo;
	}

	public String getShootDttm() {
		return shootDttm;
	}

	public String getTolofNm() {
		return tolofNm;
	}

	public String getCrgwNo() {
		return crgwNo;
	}

	public String getCrgwVhno() {
		return crgwVhno;
	}

	public String getRpcsVhno() {
		return rpcsVhno;
	}

	public String getNmrecgCd() {
		return nmrecgCd;
	}

	public String getDtrmNmrecgCd() {
		return dtrmNmrecgCd;
	}

	public String getLabelDataText() {
		return labelDataText;
	}

	public String getDtrmYn() {
		return dtrmYn;
	}

	public String getDtrmDttm() {
		return dtrmDttm;
	}

	public String getProsYn() {
		return prosYn;
	}

	public String getProsDttm() {
		return prosDttm;
	}

	public String getImageData() {
		return imageData;
	}

	public String getDelYn() {
		return delYn;
	}

    
}
