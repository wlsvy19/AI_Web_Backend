package com.egov.ex.controller;


import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.CombDtstSearchDto;
import com.egov.ex.dto.StatLabelSearchData;
import com.egov.ex.entity.CombDtst;
import com.egov.ex.service.CombDtstService;
import com.egov.ex.service.StatService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 학습 데이터셋
 * </p>
 *
 * @author  
 * @since 2022-06-07
 */
@Api(tags = "08.통합 데이터셋")
@RestController
public class StatController {

    @Resource
    private StatService ststService;

    // 학습 데이터 셋
    @PostMapping("/api/stdy-dtst/data")
    public AjaxResp stdyDtstData(@RequestBody StatLabelSearchData param) throws Exception{
        Map<String,Object> data = ststService.selectStdtDtstData(param);
        return AjaxResp.success(data);
    }

}
