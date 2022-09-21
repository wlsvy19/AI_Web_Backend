package com.egov.ex.entity;

import java.time.LocalDate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 정상 번호판 영상 이미지 정보
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PlateImg", description="정상 번호판 영상 이미지 정보")
public class PlateImg {

    private static final long serialVersionUID = 1L;

    public byte[] getImgData() {
		return imgData;
	}

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

    @ApiModelProperty(value = "사진 넓이")
    private int width;

    @ApiModelProperty(value = "사진 높이")
    private int height;    

}
