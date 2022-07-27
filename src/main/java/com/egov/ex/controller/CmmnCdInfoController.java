package com.egov.ex.controller;


import com.egov.ex.dto.AjaxResp;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/api/cmmn-cd-info/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");
    }
}
