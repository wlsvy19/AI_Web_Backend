package com.egov.ex.controller;


import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.ServerStatusDto;
import com.egov.ex.entity.Dashboard;
import com.egov.ex.entity.ServerStatus;
import com.egov.ex.service.ServerStatusService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 서버 상태 모니터링
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "14.서버 상태 모니터링")
@RestController
public class ServerStatusController {
    @Resource
    private ServerStatusService serverStatusService;

    @GetMapping("/api/server-status/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @ApiOperation("서버 모니터링")
    @PostMapping("/api/server-status/data")
    public AjaxResp serverStatus(@RequestBody ServerStatusDto param) throws Exception {
        ServerStatus data = serverStatusService.selectServerStatusInfo(param);
        return AjaxResp.success(data);

    }
}
