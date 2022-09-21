package com.egov.ex.controller;


import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.CommonSearchImgDataDto;
import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.entity.IncnImg;
import com.egov.ex.entity.PlateImg;
import com.egov.ex.service.PlateImgService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

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
    
    @PostMapping(value="/api/plate-img/data")
    public AjaxResp crgwImgTest(@RequestBody CrgwImgSearchData param) throws Exception {
    	PlateImg info = plateImgService.selectPlateImgById(param);
        return AjaxResp.success(info);
    }
    
    @ApiOperation("번호판 영상 삭제여부 업데이트")
    @PostMapping("/api/plate-img/data/del")
    public AjaxResp plateImgDel(@RequestBody CommonSearchImgDataDto param) throws Exception {    	
    	int data = plateImgService.updatePlateImgDelYnByPk(param);                
        return AjaxResp.success(data);
    }
    
}
