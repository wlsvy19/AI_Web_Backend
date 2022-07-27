package com.egov.ex.controller;


import com.egov.ex.dto.*;
import com.egov.ex.entity.LearnHistory;
import com.egov.ex.entity.UserInfo;
import com.egov.ex.entity.WeightInfo;
import com.egov.ex.service.WeightInfoService;
import com.egov.ex.util.AppConfig;
import com.egov.ex.util.CookieUtils;
import com.egov.ex.util.PageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 가중치
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "17.가중치")
@RestController
public class WeightInfoController {
    @Resource
    private WeightInfoService weightInfoService;

    @GetMapping("/api/weight-info/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @ApiOperation("가중치 리스트")
    @PostMapping("/api/weight-info/list")
    public AjaxResp weightInfoList(@RequestBody WeightSearchDto param) throws Exception {
        List<WeightInfo> list = weightInfoService.selectWeightInfoList(param);
        return AjaxResp.success(list);
    }

}
