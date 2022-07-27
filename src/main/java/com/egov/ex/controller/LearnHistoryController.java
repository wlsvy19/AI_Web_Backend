package com.egov.ex.controller;


import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.LearnHisSearchDto;
import com.egov.ex.dto.Page;
import com.egov.ex.dto.ServerStatusDto;
import com.egov.ex.entity.LearnHistory;
import com.egov.ex.service.LearnHistoryService;
import com.egov.ex.util.PageUtil;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 학습이력
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Api(tags = "08.학습이력")
@RestController
public class LearnHistoryController {
    @Resource
    private LearnHistoryService learnHistoryService;

    @GetMapping("/api/learn-history/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @ApiOperation("학습 이력")
    @PostMapping("/api/learn-history/list")
    public AjaxResp serverStatus(@RequestBody LearnHisSearchDto param) throws Exception {
        PageUtil.startPage(param);
        List<LearnHistory> list = learnHistoryService.selectLearnHistoryListPage(param);
        return AjaxResp.success(PageUtil.of(list));
    }

}
