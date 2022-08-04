package com.egov.ex.controller;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.entity.CmmnCdInfo;
import com.egov.ex.service.CommonService;

import io.swagger.annotations.Api;

/**
 * <p>
 * 상환판 집계
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "03.공통")
@RestController
public class CommonController {

    @Resource
    private CommonService commonService;

    @PostMapping("/api/common/menu/list")
    public AjaxResp menuList() throws IOException {
        List<HashMap> list = commonService.selectMenuList("0");
        for(HashMap m: list) {
            List<HashMap> slist = commonService.selectMenuList(m.get("MENU_NO").toString());
            m.put("list", slist);
        }
        return AjaxResp.success(list);
    }

    @PostMapping("/api/common/code/list")
    public AjaxResp codeList(@RequestBody List<String> codes) throws IOException {
        Map result = new HashMap();
        for (String code : codes) {
            List<CmmnCdInfo> list = commonService.selectCmmnCdList(code);
            result.put(code, list);
        }
        return AjaxResp.success(result);
    }
}
