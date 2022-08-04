package com.egov.ex.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 차로 영상 이미지 정보
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="CrgwImg", description="차로 영상 이미지 정보")
public class CrgwImg {

	private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "생성순번")
    private String workNo;

    private String labelType;

    @ApiModelProperty(value = "파일명")
    private String fileNm;

    @ApiModelProperty(value = "파일경로")
    private String filePath;

    @ApiModelProperty(value = "파일Blob")
    private byte[] imgData;
    
	public String getWorkDate() {
		return workDate;
	}

	public String getWorkNo() {
		return workNo;
	}

	public String getLabelType() {
		return labelType;
	}

	public String getFileNm() {
		return fileNm;
	}

	public String getFilePath() {
		return filePath;
	}

	public byte[] getImgData() {
		return imgData;
	}

}
