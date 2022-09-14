package com.egov.ex.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.RpcsValidationStatusInfoDto;
import com.egov.ex.dto.TolofInfoDto;
import com.egov.ex.entity.RpcsValidationStatusInfo;
import com.egov.ex.entity.TolofInfo;
import com.egov.ex.service.RpcsValidationStatusService;

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
@Api(tags = "21.재인식 비교 검증 상태 모니터링")
@RestController
public class RpcsValidationStatusController {
    @Resource
    private RpcsValidationStatusService rpcsValidationStatusService;

    @GetMapping("/api/rpcs-status/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @ApiOperation("검증상태 모니터링")
    @PostMapping("/api/rpcs-status/data")
    public AjaxResp learnStatus(@RequestBody RpcsValidationStatusInfoDto param) throws Exception {
        RpcsValidationStatusInfo data = rpcsValidationStatusService.selectRpcsValidationStatusInfo(param);                
        return AjaxResp.success(data);
    }
    
    @ApiOperation("검증 시작")
    @PostMapping("/api/rpcs-status/data/start")
    public AjaxResp startStudy(@RequestBody RpcsValidationStatusInfoDto param) throws Exception {        
        
        int data = rpcsValidationStatusService.updateStartRpcsValidationStatusInfo(param);
        return AjaxResp.success(data);
    }
    
    @ApiOperation("검증진행 멈추기")
    @PostMapping("/api/rpcs-status/data/stop")
    public AjaxResp stopStudy(@RequestBody RpcsValidationStatusInfoDto param) throws Exception {
    	int data = rpcsValidationStatusService.updateStopRpcsValidationStatusInfo(param);
        return AjaxResp.success(data);
    }
    
    @ApiOperation("검증 완료")
    @PostMapping("/api/rpcs-status/data/complete")
    public AjaxResp completeStudy(@RequestBody RpcsValidationStatusInfoDto param) throws Exception {
    	int data = rpcsValidationStatusService.updateCompleteRpcsValidationStatusInfo(param);
        return AjaxResp.success(data);
    }
    
    @ApiOperation("스텝 변경")
    @PostMapping("/api/rpcs-status/data/step")
    public AjaxResp changeValidationStep(@RequestBody RpcsValidationStatusInfoDto param) throws Exception {
    	int data = rpcsValidationStatusService.updateStepRpcsValidationStatusInfo(param);
        return AjaxResp.success(data);
    }
    
    @ApiOperation("수도권 목록 조회")
    @PostMapping("/api/tolof-info/data/hdqr")
    public AjaxResp getHdqrInfoList() throws Exception {
    	List<TolofInfo> data = rpcsValidationStatusService.selectHdqrNmList();
        return AjaxResp.success(data);
    }
    
    @ApiOperation("지사 목록 조회")
    @PostMapping("/api/tolof-info/data/mtn")
    public AjaxResp getMtnInfoList(@RequestBody TolofInfoDto param) throws Exception {
    	List<TolofInfo> data = rpcsValidationStatusService.selectMtnofNmListByHdqrCd(param);
        return AjaxResp.success(data);
    }
    
    @ApiOperation("영업소 목록 조회")
    @PostMapping("/api/tolof-info/data/tol")
    public AjaxResp getTolInfoList(@RequestBody TolofInfoDto param) throws Exception {
    	List<TolofInfo> data = rpcsValidationStatusService.selectTolofNmListByCd(param);
        return AjaxResp.success(data);
    }
    
    @ApiOperation("차로 정보 조회")
    @PostMapping("/api/tolof-info/data/crgw")
    public AjaxResp getCrgwInfoList(@RequestBody TolofInfoDto param) throws Exception {
    	List<TolofInfo> data = rpcsValidationStatusService.selectCrgwInfoListByCd(param);
        return AjaxResp.success(data);
    }
}
