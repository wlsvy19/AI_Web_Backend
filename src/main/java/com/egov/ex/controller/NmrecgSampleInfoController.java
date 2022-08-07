package com.egov.ex.controller;


import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.NmrecGSampleSearchDto;
import com.egov.ex.entity.NmrecgSampleInfo;
import com.egov.ex.service.NmrecgSampleInfoService;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Base64;

/**
 * <p>
 * 미오인식 유형 샘플
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "12.미오인식 유형 샘플")
@RestController
public class NmrecgSampleInfoController {

    @Resource
    private NmrecgSampleInfoService nmrecgSampleInfoService;

    @GetMapping("/api/nmrecg-sample-info/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @GetMapping(value = "/api/sample-info/data", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody
    byte[] nmrecgSampleInfoData(NmrecGSampleSearchDto param) throws Exception {
        NmrecgSampleInfo info = nmrecgSampleInfoService.selectNmrecgSampleInfoDataByCmmnCd(param);
//        return Base64.getDecoder().decode(info.getImgData().getBytes());
        return info.getImgData();
    }
}
