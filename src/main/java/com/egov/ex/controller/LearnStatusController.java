package com.egov.ex.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.LearnStatusDto;
import com.egov.ex.dto.LearnStatusInfoDto;
import com.egov.ex.entity.LearnStatus;
import com.egov.ex.entity.LearnStatusInfo;
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
    public AjaxResp learnStatus(@RequestBody LearnStatusDto param) throws Exception {
        List<LearnStatus> data = learnStatusService.selectLearnStatus(param);                
        return AjaxResp.success(data);
    }

    @ApiOperation("학습진행에서 현재 날짜 기준 학습하기")
    @PostMapping("/api/learn-status/data/start")
    public AjaxResp startStudy(@RequestBody LearnStatusInfoDto param) throws Exception {
        if(StringUtils.isEmpty(param.getCombDtstId())) return AjaxResp.error("NULL_VALUE", "데이터셋 ID를 입력하세요.");        
        if(StringUtils.isEmpty(param.getEngineType())) return AjaxResp.error("NULL_VALUE", "데이터쏏 유형을 입력하세요.");        
        
        int data = learnStatusService.updateStartLearnStatusInfo(param);
        return AjaxResp.success(data);
    }
    
    @ApiOperation("학습진행중 정보")
    @PostMapping("/api/learn-status/data/ing")
    public AjaxResp studying() throws Exception {
    	LearnStatusInfo data = learnStatusService.selectLearnStatusInfo();
        return AjaxResp.success(data);
    }
    
    @ApiOperation("학습진행 멈추기")
    @PostMapping("/api/learn-status/data/stop")
    public AjaxResp stopStudy(@RequestBody LearnStatusInfoDto param) throws Exception {
    	int data = learnStatusService.updateStopLearnStatusInfo();
        return AjaxResp.success(data);
    }
    
    @ApiOperation("학습 완료")
    @PostMapping("/api/learn-status/data/complete")
    public AjaxResp completeStudy() throws Exception {
    	int data = learnStatusService.updateCompeleteLearnStatusInfo();
        return AjaxResp.success(data);
    }
}
