package com.egov.ex.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 꺾임훼손 영상 이미지 정보
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="IncnImg", description="꺾임훼손 영상 이미지 정보")
public class IncnImg {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "생성순번")
    private String workNo;

    @ApiModelProperty(value = "라벨 타입")
	private String labelType;

    @ApiModelProperty(value = "파일명")
    private String fileNm;

    @ApiModelProperty(value = "파일경로")
    private String filePath;
    
    @ApiModelProperty(value = "파일Blob")
    private byte[] imgData;

    public byte[] getImgData() {
		return imgData;
	}

}
