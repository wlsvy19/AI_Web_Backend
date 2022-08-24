package com.egov.ex.controller;


import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.ExlprServerInfoSearchDto;
import com.egov.ex.dto.UnitDtstSearchDto;
import com.egov.ex.entity.ExlprServerInfo;
import com.egov.ex.entity.UnitDtst;
import com.egov.ex.service.UnitDtstService;
import com.egov.ex.util.PageUtil;

import io.swagger.annotations.Api;

/**
 * <p>
 * 단위 데이터셋
 * </p>
 *
 * @author  
 * @since 2022-06-20
 */
@Api(tags = "15.단위 데이터셋")
@RestController
public class UnitDtstController {

    @Resource
    private UnitDtstService unitDtstService;

    @GetMapping("/api/unit-dtst/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @PostMapping("/api/unit-dtst/list")
    public AjaxResp list(@RequestBody UnitDtstSearchDto param) throws Exception {
    	PageUtil.startPage(param);
        List<UnitDtst> list = unitDtstService.selectUnitDtstList(param);
        return AjaxResp.success(PageUtil.of(list));
    }
    
    @PostMapping("/api/unit-dtst/list/id")
    public AjaxResp unitDtstListById(@RequestBody UnitDtstSearchDto param) throws Exception {
        PageUtil.startPage(param);
        List<UnitDtst> list = unitDtstService.selectUnitDtstListById(param);
        return AjaxResp.success(PageUtil.of(list));
    }

    @PostMapping("/api/updt/list")
    public AjaxResp updtList(@RequestBody ExlprServerInfoSearchDto param) throws Exception {
        PageUtil.startPage(param);
        List<ExlprServerInfo> list = unitDtstService.updtList(param);        
        return AjaxResp.success(PageUtil.of(list));
    }

    @PostMapping("/api/updt/hdqr/list")
    public AjaxResp hdqrList() throws Exception {        
    	List<HashMap> list = unitDtstService.hdqrList(); 
        return AjaxResp.success(list);
    }

}
