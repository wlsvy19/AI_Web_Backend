package com.egov.ex.controller;


import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.entity.Dashboard;
import com.egov.ex.service.DashboardService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 상환판 집계
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "06.상환판 집계")
@RestController
public class DashboardController {

    @Resource
    private DashboardService dashboardService;

    @GetMapping("/api/dashboard/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");
    }

    @ApiOperation("대쉬보드")
    @PostMapping("/api/dashboard/data")
    public AjaxResp dashboard() throws Exception {
        Dashboard dashboard = dashboardService.selectDashboardByTerm();
        return AjaxResp.success(dashboard);

    }
    
    @ApiOperation("대쉬보드")
    @PostMapping("/api/dashboard/nmrecg")
    public AjaxResp nmrecg() throws Exception {
        List<HashMap> dashboard = dashboardService.selectNmrecg();
        return AjaxResp.success(dashboard);
    }
    
    
//    @PostMapping(value="/api/crgw-img-data/list")
//    public AjaxResp crgwImgList(@RequestBody CrgwImgDataSearchData param) throws Exception {
////        param.setWorkDate("2022-05-30"); //test
//        PageUtil.startPage(param);
//        List<CrgwImgData> list = crgwImgDataService.selectCrgwImgDataList(param);
//        return AjaxResp.success(PageUtil.of(list));
}
