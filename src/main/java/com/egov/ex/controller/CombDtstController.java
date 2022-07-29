package com.egov.ex.controller;


import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.CombDtstSearchDto;
import com.egov.ex.entity.CombDtst;
import com.egov.ex.service.CombDtstService;
import com.egov.ex.util.PageUtil;

import io.swagger.annotations.Api;

/**
 * <p>
 * 통합 데이터셋
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "03.통합 데이터셋")
@RestController
public class CombDtstController {

    @Resource
    private CombDtstService combDtstService;

    @GetMapping("/api/comb-dtst/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @PostMapping("/api/comb-dtst/count")
    public AjaxResp crgwListCount(@RequestBody CombDtstSearchDto param) throws IOException, NoSuchAlgorithmException {
        List<HashMap> list = combDtstService.selectDtstListCount(param);
        return AjaxResp.success(list);
    }

    @PostMapping("/api/comb-dtst/list")
    public AjaxResp combDtstList(@RequestBody CombDtstSearchDto param) throws IOException, NoSuchAlgorithmException {
    	PageUtil.startPage(param);
        List<CombDtst> list = combDtstService.selectDtstList(param);
        return AjaxResp.success(PageUtil.of(list));
    }
    
    @PostMapping("/api/comb-dtst/info")
    public AjaxResp crgwListInfo(@RequestBody CombDtstSearchDto param) throws IOException, NoSuchAlgorithmException {
        CombDtst info = combDtstService.selectDtstInfoById(param);
        return AjaxResp.success(info);
    }
    
    @PostMapping("/api/comb-dtst/learn/list")
    public AjaxResp crgwListLean(@RequestBody CombDtstSearchDto param) throws IOException, NoSuchAlgorithmException {
        List<CombDtst> list = combDtstService.selectDtstLearnList(param);
        return AjaxResp.success(list);
    }
}
