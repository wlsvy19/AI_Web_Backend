package com.egov.ex.controller;


import com.egov.ex.dto.*;
import com.egov.ex.entity.LearnHistory;
import com.egov.ex.entity.UserInfo;
import com.egov.ex.service.UserService;
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
 * 사용자 정보
 * </p>
 *
 * @author  
 * @since 2022-06-03
 */
@Api(tags = "16.사용자 정보")
@RestController
public class UserInfoController {
    @Resource
    private UserService userService;
    @GetMapping("/api/user-info/index")
    public AjaxResp hello() {
        return AjaxResp.success("ok");

    }

    @PostMapping("/api/user-info/list")
    public AjaxResp list(@RequestBody UserInfoSearchDto param) throws Exception {
        PageUtil.startPage(param);
        List<UserInfo> list = userService.selectUserListPage(param);
        return AjaxResp.success(PageUtil.of(list));
    }

    @PostMapping("/api/user-info/save")
    public AjaxResp save(@RequestBody UserInfoSaveDto param) throws Exception {
        UserInfo userInfo = userService.selectByUserUserId(param);
        if(param.getUserNo() == 0 && userInfo != null) return AjaxResp.success("로그인 아이디가 이미 존재합니다.");
        userService.saveUser(param);
        return AjaxResp.success();
    }

    @PostMapping("/api/user-info/del")
    public AjaxResp del(@RequestBody UserInfoDelDto param) throws Exception {
        userService.deleteUser(param);
        return AjaxResp.success();
    }

}
