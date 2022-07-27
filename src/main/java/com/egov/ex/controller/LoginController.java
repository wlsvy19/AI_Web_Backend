package com.egov.ex.controller;


import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.LoginFindUserPwVo;
import com.egov.ex.dto.LoginVo;
import com.egov.ex.dto.UserTokenVo;
import com.egov.ex.entity.UserInfo;
import com.egov.ex.service.UserService;
import com.egov.ex.util.AppConfig;
import com.egov.ex.util.CookieUtils;
import com.egov.ex.util.SHA256;
import com.egov.ex.util.TokenUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * <p>
 * 로그인
 * </p>
 *
 * @author fang
 * @since 2022-06-01
 */
@Api(tags = "00.로그인")
@RestController
public class LoginController {
    @Resource
    private TokenUtils tokenUtils;
    @Resource
    private UserService userInfoService;

    @GetMapping()
    public String index(HttpServletResponse response) throws IOException {
       response.sendRedirect("/swagger-ui.html");
        return "redirect:/swagger-ui.html";
    }

    @ApiOperation("로그인")
    @PostMapping("/api/user/login")
    public AjaxResp login(@Valid @RequestBody LoginVo login, HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserInfo user = userInfoService.getUser(login.getLoginId(), login.getLoginPwd());
        if(user == null)  {
            return AjaxResp.error("LOGIN_PW_ERROR", AjaxResp.LOGIN_PW_ERROR);
        }
        String accessToken = tokenUtils.generateJwtToken(user);
        CookieUtils.addCookie(response, AppConfig.ACCESS_TOKEN, accessToken,-1);
        UserTokenVo userTokenVo = new UserTokenVo();
        userTokenVo.setAccessToken(accessToken);
        return AjaxResp.success(userTokenVo);

    }

    @ApiOperation("로그인정보")
    @PostMapping("/api/user/info")
    public AjaxResp userInfo(HttpServletRequest request) throws Exception {
        String accessToken = CookieUtils.getCookieValue(request, AppConfig.ACCESS_TOKEN);
        int userNo = userInfoService.getLoginUserNoByRequest();
        UserInfo user = userInfoService.getByUserNo(userNo);
        user.setAccessToken(accessToken);
        return AjaxResp.success(user);
    }


    @PostMapping("/api/user/findPw")
    public AjaxResp findPw(@RequestBody LoginFindUserPwVo param) throws Exception {
        UserInfo user = userInfoService.selectByUserNmAndEmail(param.getUserNm(), param.getEmail(), "90");
        if(!(user != null && param.getLoginId().equals(user.getUserId()))) {
            return AjaxResp.success(null, "정보가 일치하지 않습니다.");
        }
        String initPw = UUID.randomUUID().toString().substring(0,10);
        user.setUserPswd(SHA256.encrypt(initPw));
        user.setLsttmAltrDttm(LocalDateTime.now().toString());
        // user.updateById();
        // userInfoService.sendEmail(user.getEmail(),"관리자 비밀번호 찾기", "ID: "+user.getLoginId()+",PW: "+initPw+"\n비밀번호 초기화 되었습니다.\n로그인후 수정하시기 바랍니다.");
        return AjaxResp.success(null,"이메일로 발송 되었습니다.");
    }

}
