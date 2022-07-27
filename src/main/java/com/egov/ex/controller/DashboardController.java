package com.egov.ex.controller;


import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.LoginVo;
import com.egov.ex.dto.UserTokenVo;
import com.egov.ex.entity.Dashboard;
import com.egov.ex.entity.UserInfo;
import com.egov.ex.service.DashboardService;
import com.egov.ex.util.AppConfig;
import com.egov.ex.util.CookieUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * <p>
 * 상환판 집계
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "06.상환판 집계")
@RestController
public class DashboardController {

    @Resource
    private DashboardService dashboardService;

    @GetMapping("/api/dashboard/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");
    }

    @ApiOperation("대쉬보드")
    @PostMapping("/api/dashboard/data")
    public AjaxResp dashboard() throws Exception {
        Dashboard dashboard = dashboardService.selectDashboardByTerm();
        return AjaxResp.success(dashboard);

    }
}
