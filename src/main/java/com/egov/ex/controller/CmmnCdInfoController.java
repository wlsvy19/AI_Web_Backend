package com.egov.ex.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.CmmnCdInfoDto;
import com.egov.ex.entity.CmmnCdInfo;
import com.egov.ex.service.CmmnCdInfoService;

import io.swagger.annotations.Api;

/**
 * <p>
 * 공통 코드 정보
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@RestController
@Api(tags = "02.공통 코드 정보")
public class CmmnCdInfoController {
	@Resource
    private CmmnCdInfoService cmmnCdInfoService;
	
    @GetMapping("/api/cmmn-cd-info/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");
    }
    
    @PostMapping("/api/cmmn-cd-info/ngtp")
    public AjaxResp getNgtpCode() {
    	String code = "NGTP";
    	List<CmmnCdInfo> list = cmmnCdInfoService.selectCmmnCdList(code);
    	Map result = new HashMap();
    	
    	for(int i=0;i<list.size(); i++) {    		
    		result.put(list.get(i).getCmmnCd(), list.get(i).getCmmnCdNm());
    	}
    	
        return AjaxResp.success(result);
    }
    
    @PostMapping("/api/cmmn-cd-info/code")
    public AjaxResp getCodebyGroupCode(@RequestBody CmmnCdInfoDto param) throws Exception { 
    	
    	List<CmmnCdInfo> data = cmmnCdInfoService.selectCmmnCdList(param.getGrpCd());
        return AjaxResp.success(data);
    }
}
