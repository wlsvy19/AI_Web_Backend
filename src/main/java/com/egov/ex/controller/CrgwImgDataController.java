package com.egov.ex.controller;


import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.CommonSearchImgDataDto;
import com.egov.ex.dto.CrgwImgDataSaveData;
import com.egov.ex.dto.CrgwImgDataSearchData;
import com.egov.ex.entity.CrgwImgData;
import com.egov.ex.service.CrgwImgDataService;
import com.egov.ex.util.PageUtil;

import io.swagger.annotations.Api;

/**
 * <p>
 * 차로 영상 데이터
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "05.차로 영상 데이터")
@RestController
public class CrgwImgDataController {
    @Resource
    private CrgwImgDataService crgwImgDataService;

    @GetMapping("/api/crgw-img-data/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @PostMapping(value="/api/crgw-img-data/list")
    public AjaxResp crgwImgList(@RequestBody CrgwImgDataSearchData param) throws Exception {
//        param.setWorkDate("2022-05-30"); //test
        PageUtil.startPage(param);
        List<CrgwImgData> list = crgwImgDataService.selectCrgwImgDataList(param);
        return AjaxResp.success(PageUtil.of(list));
    }

    @PostMapping(value="/api/crgw-img-data/list/page")
    public AjaxResp crgwImgListPage(@RequestBody CrgwImgDataSearchData param) throws Exception {
        PageUtil.startPage(param);
        List<CrgwImgData> list = crgwImgDataService.selectCrgwImgDataListPage(param);
        return AjaxResp.success(PageUtil.of(list));
    }

    @PostMapping(value="/api/crgw-img-data/save")
    public AjaxResp crgwImgSave(@RequestBody CrgwImgDataSaveData param) throws Exception {
        crgwImgDataService.updateCrgwImgDataById(param);
        return AjaxResp.success();
    }

    @PostMapping(value="/api/crgw-img-data/del")
    public AjaxResp crgwImgDel(@RequestBody CommonSearchImgDataDto param) throws Exception {
        int rs = crgwImgDataService.updateCrgwImgDataDelYnById(param);
        return AjaxResp.success(rs);
    }
    
    @PostMapping("/api/crgw-img-data/list/count")
    public AjaxResp crgwImgDataListCount(@RequestBody CrgwImgDataSearchData param) throws IOException, NoSuchAlgorithmException {
        List<HashMap> list = crgwImgDataService.selectCrgwImgDataListCount(param);
        return AjaxResp.success(list);
    }
    
    @PostMapping(value="/api/crgw-img-data/pros")
    public AjaxResp crgwImg(@RequestBody CommonSearchImgDataDto param) throws Exception {
        int rs = crgwImgDataService.updateCrgwImgDataProsYnById(param);
        return AjaxResp.success(rs);
    }
}
