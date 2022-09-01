package com.egov.ex.controller;


import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.ValidationResultDto;
import com.egov.ex.entity.ValidationResult;
import com.egov.ex.service.ValidationResultService;

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
@Api(tags = "19.검증 결과")
@RestController
public class ValidationResultController {
    @Resource
    private ValidationResultService validationResultService;

    @GetMapping("/api/validation-result/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @ApiOperation("검증결과 불러오기")
    @PostMapping("/api/validation-result/data")
    public AjaxResp getValdiationResult(@RequestBody ValidationResultDto param) throws Exception {
    	List<ValidationResult> data = validationResultService.selectValidationResultById(param);                
        return AjaxResp.success(data);
    }
    
    @ApiOperation("전체 검증 결과 수")
    @PostMapping("/api/validation-result/data/count")
    public AjaxResp getValdiationResultCount(@RequestBody ValidationResultDto param) throws Exception {
    	int data = validationResultService.selectValidationResultCountById(param);                
        return AjaxResp.success(data);
    }
}
