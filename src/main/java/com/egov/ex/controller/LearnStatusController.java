package com.egov.ex.controller;


import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.LearnStatusDto;
import com.egov.ex.dto.LearnStatusTempDto;
import com.egov.ex.entity.LearnStatusTemp;
import com.egov.ex.service.LearnStatusService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 학습 상태 모니터링
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "10.학습 상태 모니터링")
@RestController
public class LearnStatusController {
    @Resource
    private LearnStatusService learnStatusService;

    @GetMapping("/api/learn-status/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @ApiOperation("학습상태 모니터링")
    @PostMapping("/api/learn-status/data")
    public AjaxResp learnStatus(@RequestBody LearnStatusTempDto param) throws Exception {
        List<LearnStatusTemp> data = learnStatusService.selectLearnStatusInfo(param);                
        return AjaxResp.success(data);
    }

    @ApiOperation("학습진행에서 현재 날짜 기준 학습하기")
    @PostMapping("/api/learn-status/data/start")
    public AjaxResp startStudy(@RequestBody LearnStatusDto param) throws Exception {
        // LearnStatus data = learnStatusService.selectLearnStatusInfo(param);
        if(StringUtils.isEmpty(param.getWorkDate())) return AjaxResp.error("NULL_VALUE", "날자를 입력하세요.");
        if(StringUtils.isEmpty(param.getLearnDtstId())) return AjaxResp.error("NULL_VALUE", "데이터셋 ID를 입력하세요.");
        if(StringUtils.isEmpty(param.getWeightId())) return AjaxResp.error("NULL_VALUE", "가중치를 입력하세요.");
        if(StringUtils.isEmpty(param.getLearnDtstType())) return AjaxResp.error("NULL_VALUE", "데이터쏏 유형을 입력하세요.");
        int r = learnStatusService.insertLearnStatusInfo(param);
        if(r == 0) learnStatusService.updateStartLearnStatusInfo(param);
        return AjaxResp.success();
    }

    @ApiOperation("학습진행에서 현재 날짜 기준 학습하기")
    @PostMapping("/api/learn-status/data/stop")
    public AjaxResp stopStudy(@RequestBody LearnStatusDto param) throws Exception {
        if(StringUtils.isEmpty(param.getWorkDate())) return AjaxResp.error("NULL_VALUE", "날자를 입력하세요.");
        if(StringUtils.isEmpty(param.getLearnDtstId())) return AjaxResp.error("NULL_VALUE", "데이터셋 ID를 입력하세요.");
        if(StringUtils.isEmpty(param.getWeightId())) return AjaxResp.error("NULL_VALUE", "가중치를 입력하세요.");
        if(StringUtils.isEmpty(param.getLearnDtstType())) return AjaxResp.error("NULL_VALUE", "데이터쏏 유형을 입력하세요.");
        learnStatusService.updateStopLearnStatusInfo(param);
        return AjaxResp.success();
    }

}
