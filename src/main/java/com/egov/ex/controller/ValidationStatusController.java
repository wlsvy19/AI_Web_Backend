package com.egov.ex.controller;


import javax.annotation.Resource;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.LearnStatusInfoDto;
import com.egov.ex.dto.ValidationStatusInfoDto;
import com.egov.ex.entity.ValidationStatusInfo;
import com.egov.ex.service.ValidationStatusService;

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
@Api(tags = "18.검증 상태 모니터링")
@RestController
public class ValidationStatusController {
    @Resource
    private ValidationStatusService validationStatusService;

    @GetMapping("/api/validation-status/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @ApiOperation("검증상태 모니터링")
    @PostMapping("/api/validation-status/data")
    public AjaxResp learnStatus() throws Exception {
        ValidationStatusInfo data = validationStatusService.selectValidationStatusInfo();                
        return AjaxResp.success(data);
    }
    
    @ApiOperation("검증 시작")
    @PostMapping("/api/validation-status/data/start")
    public AjaxResp startStudy(@RequestBody ValidationStatusInfoDto param) throws Exception {
        if(StringUtils.isEmpty(param.getWeightId())) return AjaxResp.error("NULL_VALUE", "검증할 가중치를 선택해주세요.");        
        if(StringUtils.isEmpty(param.getDtstId())) return AjaxResp.error("NULL_VALUE", "검증에 사용할 데이터셋을 선택해주세요.");        
        
        int data = validationStatusService.updateStartValidationStatusInfo(param);
        return AjaxResp.success(data);
    }
    
    @ApiOperation("검증진행 멈추기")
    @PostMapping("/api/validation-status/data/stop")
    public AjaxResp stopStudy() throws Exception {
    	int data = validationStatusService.updateStopValidationStatusInfo();
        return AjaxResp.success(data);
    }
    
    @ApiOperation("검증 완료")
    @PostMapping("/api/validation-status/data/complete")
    public AjaxResp completeStudy() throws Exception {
    	int data = validationStatusService.updateCompleteValidationStatusInfo();
        return AjaxResp.success(data);
    }
}
