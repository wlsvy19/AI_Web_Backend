package com.egov.ex.controller;


import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.entity.PlateImg;
import com.egov.ex.service.PlateImgService;

import io.swagger.annotations.Api;

/**
 * <p>
 * 정상 번호판 영상 이미지 정보
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "13.정상 번호판 영상 이미지 정보")
@RestController
public class PlateImgController {
    @Resource
    private PlateImgService plateImgService;
    
    @GetMapping("/api/plate-img/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }
    
    
    @GetMapping(value="/api/plate-img/data", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] plateImg(CrgwImgSearchData param) throws Exception {
        PlateImg info = plateImgService.selectPlateImgById(param);
        return info.getImgData();
    }
}
