package com.egov.ex.controller;


import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.LearnStatusDto;
import com.egov.ex.dto.NmrecgClsfDto;
import com.egov.ex.service.NmrecgClsfService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 미오인식 유형분류 결과
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "11.미오인식 유형분류 결과링")
@RestController
public class NmrecgClsfController {

    @Resource()
    private NmrecgClsfService nmrecgClsfService;

    @GetMapping("/api/nmrecg-clsf/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");
    }

    @PostMapping("/api/nmrecg-clsf/data")
    public AjaxResp nmrecgClsfData(@RequestBody NmrecgClsfDto param) throws Exception {
        int r = nmrecgClsfService.updateNmRecgClsf(param);
        if (r == 0) nmrecgClsfService.insertNmRecgClsf(param);
        return AjaxResp.success();

    }
}
