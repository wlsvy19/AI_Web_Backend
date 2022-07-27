package com.egov.ex.controller;


import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.LabelRsltSaveDto;
import com.egov.ex.dto.LearnStatusDto;
import com.egov.ex.entity.LabelRslt;
import com.egov.ex.service.LabelRsltService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 라벨링 결과
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "07.라벨링 결과")
@RestController
public class LabelRsltController {
    @Resource
    private LabelRsltService labelRsltService;
    @GetMapping("/api/label-rslt/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @PostMapping("/api/label-rslt/data")
    public AjaxResp rsltData(@RequestBody LabelRslt param) throws Exception {
        LabelRslt data = labelRsltService.selectLabelRsltById(param);
        return AjaxResp.success(data);
    }

    @PostMapping("/api/label-rslt/data/save")
    public AjaxResp rsltDataSave(@RequestBody LabelRslt param) throws Exception {
        int r = labelRsltService.updateLabelRslt(param);
        if (r == 0) labelRsltService.insertLabelRslt(param);
        return AjaxResp.success();
    }
}
