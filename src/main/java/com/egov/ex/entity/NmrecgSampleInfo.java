package com.egov.ex.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 미오인식 유형 샘플
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="NmrecgSampleInfo", description="미오인식 유형 샘플")
public class NmrecgSampleInfo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "그룹코드")
    private String grpCd;
    
    @ApiModelProperty(value = "유형코드")
    private String cmmnCd;

    public byte[] getImgData() {
		return imgData;
	}

//	@ApiModelProperty(value = "img data")
//    private String imgData;
		
    @ApiModelProperty(value = "파일Blob")
    private byte[] imgData;
	

}
