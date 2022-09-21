package com.egov.ex.controller;


import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.CommonSearchImgDataDto;
import com.egov.ex.dto.SearchLabelRsltDto;
import com.egov.ex.entity.LabelRslt;
import com.egov.ex.service.LabelRsltService;

import io.swagger.annotations.Api;

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
    public AjaxResp rsltData(@RequestBody SearchLabelRsltDto param) throws Exception {
        LabelRslt data = labelRsltService.selectLabelRsltById(param);
        return AjaxResp.success(data);
    }

    @PostMapping("/api/label-rslt/data/save")
    public AjaxResp rsltDataSave(@RequestBody LabelRslt param) throws Exception {
        int r = labelRsltService.updateLabelRslt(param);
        // 2022.09.20 wook
        // label-rslt에서 가져온 데이터로 이미지를 조회함으로 무조건 있어야함
        // 따라서 insert 사용안함.        
        // if (r == 0) labelRsltService.insertLabelRslt(param);
        return AjaxResp.success(r);
    }
    
    @PostMapping(value="/api/label-rslt/data/del")
    public AjaxResp rsltDataDel(@RequestBody LabelRslt param) throws Exception {
    	labelRsltService.updateLabelRsltDel(param);
        return AjaxResp.success();
    }
    
    @PostMapping(value="/api/label-rslt/data/remove")
    public AjaxResp labelRsltRemove(@RequestBody CommonSearchImgDataDto param) throws Exception {
    	int data = labelRsltService.deleteLabelRsltById(param);
        return AjaxResp.success(data);
    }
}
