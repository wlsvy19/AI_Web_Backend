package com.egov.ex.controller;


import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.entity.IncnImg;
import com.egov.ex.service.IncnImgService;

import io.swagger.annotations.Api;

/**
 * <p>
 * 꺾임훼손 영상 이미지 정보
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "07.꺾임훼손 영상 이미지 정보")
@RestController
public class IncnImgController {
    @Resource
    private IncnImgService incnImgService;
    
    @GetMapping("/api/incn-img/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }
    
    @GetMapping(value="/api/incn-img/data", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] incnImg(CrgwImgSearchData param) throws Exception {
        IncnImg info = incnImgService.selectIncnImgById(param);
        return info.getImgData();
    }
}
