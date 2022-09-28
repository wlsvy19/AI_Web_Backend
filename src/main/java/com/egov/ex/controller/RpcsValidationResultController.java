package com.egov.ex.controller;


import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.dto.RpcsValidationResultDto;
import com.egov.ex.entity.RpcsValidationResult;
import com.egov.ex.service.RpcsValidationResultService;
import com.egov.ex.util.PageUtil;

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
public class RpcsValidationResultController {
    @Resource
    private RpcsValidationResultService rpcsValidationResultService;

    @GetMapping("/api/rpcs-result/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @ApiOperation("검증 결과 검색")
    @PostMapping("/api/rpcs-result/data")
    public AjaxResp searchValidationResult(@RequestBody RpcsValidationResultDto param) throws Exception {
    	PageUtil.startPage(param);
    	List<RpcsValidationResult> list = rpcsValidationResultService.selectRpcsValidationResult(param);                
        return AjaxResp.success(PageUtil.of(list));
    }
    
    @ApiOperation("일치 여부 카운트")
    @PostMapping("/api/rpcs-result/data/count")
    public AjaxResp countResultIsCorrect(@RequestBody RpcsValidationResultDto param) throws Exception {    	
    	HashMap data = rpcsValidationResultService.countIsCorrect(param);                
        return AjaxResp.success(data);
    }
    
    @ApiOperation("검증 결과 삭제")
    @PostMapping("/api/rpcs-result/data/remove-all")
    public AjaxResp removeResultAll() throws Exception {        
        
        int data = rpcsValidationResultService.deleteRpcsValidationResultAll();
        return AjaxResp.success(data);
    }
    
    @GetMapping(value="/api/rpcs-img/data", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] rpcsImg(RpcsValidationResultDto param) throws Exception {
    	RpcsValidationResult info = rpcsValidationResultService.selectRpcsImgByPk(param);
    	byte[] data;
        try {
        	data = info.getImgData();
        }
        catch(Exception e) {
        	data = new byte[0];
        }
               
		return data;
    }
}
