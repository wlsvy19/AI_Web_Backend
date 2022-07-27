package com.egov.ex.controller;


import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.LearnHisSearchDto;
import com.egov.ex.dto.LearnRsltDto;
import com.egov.ex.entity.LearnHistory;
import com.egov.ex.service.LearnRsltService;
import com.egov.ex.util.PageUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 학습결과
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "09.학습결과")
@RestController
public class LearnRsltController {
    @Resource
    private LearnRsltService learnRsltService;

    @GetMapping("/api/learn-rslt/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");
    }

    @PostMapping("/api/learn-rslt/save")
    public AjaxResp learnRlst(@RequestBody LearnRsltDto param) throws Exception {
        int r = learnRsltService.updateLearnRlst(param);
        return AjaxResp.success();
    }
}
