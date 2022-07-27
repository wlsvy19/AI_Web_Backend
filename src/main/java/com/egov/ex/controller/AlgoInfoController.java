package com.egov.ex.controller;


import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.ServerStatusDto;
import com.egov.ex.entity.AlgoInfo;
import com.egov.ex.entity.ServerStatus;
import com.egov.ex.service.AlgoInfoService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 알고리즘
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "01.알고리즘")
@RestController
public class AlgoInfoController {

    @Resource
    private AlgoInfoService algoInfoService;

    @GetMapping("/api/algo-info/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");
    }

    @PostMapping("/api/algo-info/list")
    public AjaxResp algoInfoList() throws Exception {
        List<AlgoInfo> data = algoInfoService.selectAlgoInfoList();
        return AjaxResp.success(data);
    }

}
