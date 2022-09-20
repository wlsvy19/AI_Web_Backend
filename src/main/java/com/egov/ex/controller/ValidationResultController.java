package com.egov.ex.controller;


import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.CommonSearchImgDataDto;
import com.egov.ex.dto.ValidationResultDto;
import com.egov.ex.entity.ValidationResult;
import com.egov.ex.service.CrgwImgDataService;
import com.egov.ex.service.CrgwImgService;
import com.egov.ex.service.IncnImgService;
import com.egov.ex.service.LabelRsltService;
import com.egov.ex.service.NmrecgClsfService;
import com.egov.ex.service.PlateImgService;
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

    @Resource
    private CrgwImgService crgwImgService;

    @Resource
    private CrgwImgDataService crgwImgDataService;
    
    @Resource
    private NmrecgClsfService nmrecgClsfService;
    
    @Resource
    private IncnImgService incnImgService;
    
    @Resource
    private PlateImgService plateImgService;
    
    @Resource
    private LabelRsltService labelRsltService;
    
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
    	HashMap data = validationResultService.selectValidationResultCountById(param);                
        return AjaxResp.success(data);
    }
    
    @ApiOperation("일치여부, 확인여부 업데이트")
    @PostMapping("/api/validation-result/data/update-correct")
    public AjaxResp updateIsCorrect(@RequestBody ValidationResultDto param) throws Exception {
    	int data = validationResultService.updateValidationResultByPk(param);                
        return AjaxResp.success(data);
    }
    
    @ApiOperation("삭제여부 업데이트")
    @PostMapping("/api/validation-result/data/del")
    public AjaxResp removeValdiationResult(@RequestBody ValidationResultDto param) throws Exception {
    	int data = 0;
    	int data1 = validationResultService.updateValidationResultDelYnByPk(param);
    	CommonSearchImgDataDto param2 = new CommonSearchImgDataDto(param);
    	if (param.getEngineType() == 'A' || param.getEngineType() == 'E') {
    		int data2 = crgwImgService.updateCrgwImgDelYnById(param2);
    		int data3 = crgwImgDataService.updateCrgwImgDataDelYnById(param2);
    		int data4 = nmrecgClsfService.updateNmrecgClsfDelYnById(param2);
    		    		
    		if (data1 == 1 && data2 == 1 && data3 == 1 && data4 == 1) {
    			data = 1;
    		}
    	}
    	else if(param.getEngineType() == 'E') {
    		int data2 = incnImgService.updateIncnImgDelYnByPk(param2);
    		
    		if (data1 == 1 && data2 == 1) {
    			data = 1;
    		}
    	}
    	else {
    		int data2 = plateImgService.updatePlateImgDelYnByPk(param2); 

    		if (data1 == 1 && data2 == 1) {
    			data = 1;
    		}
    	}
        return AjaxResp.success(data);
    }
    
    @ApiOperation("라벨링 미확정으로 업데이트")
    @PostMapping("/api/validation-result/data/relabeling")
    public AjaxResp updateReLabelingData(@RequestBody ValidationResultDto param) throws Exception {
    	int data = 0;
    	int data1 = validationResultService.updateValidationResultDelYnByPk(param);    	
    	CommonSearchImgDataDto param2 = new CommonSearchImgDataDto(param);
    	labelRsltService.deleteLabelRsltById(param2);
    	param2.setDelYn('N');
    	param2.setProsYn('N');
    	if (param.getEngineType() == 'A' || param.getEngineType() == 'E') {
    		int data2 = crgwImgDataService.updateCrgwImgDataProsYnById(param2);
    		int data3 = nmrecgClsfService.updateNmrecgClsfProsYnById(param2);
    		    		
    		if (data1 == 1 && data2 == 1 && data3 == 1) {
    			data = 1;
    		}
    	}
    	else if(param.getEngineType() == 'E') {
    		int data2 = incnImgService.updateIncnImgProsYnByPk(param2);
    		
    		if (data1 == 1 && data2 == 1) {
    			data = 1;
    		}
    	}
    	else {
    		int data2 = plateImgService.updatePlateImgProsYnByPk(param2); 

    		if (data1 == 1 && data2 == 1) {
    			data = 1;
    		}
    	}
        return AjaxResp.success(data);
    }
}
