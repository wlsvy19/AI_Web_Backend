package com.egov.ex.service;

import com.egov.ex.dto.UserInfoDelDto;
import com.egov.ex.dto.UserInfoSaveDto;
import com.egov.ex.dto.UserInfoSearchDto;
import com.egov.ex.entity.UserInfo;
import com.egov.ex.exception.CustomException;
import com.egov.ex.exception.CustomExceptionType;
import com.egov.ex.mapper.UserInfoMapper;
import com.egov.ex.util.AppConfig;
import com.egov.ex.util.ContextUtils;
import com.egov.ex.util.SHA256;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 사용자 정보 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class UserService extends EgovAbstractServiceImpl {
    @Resource
    private UserInfoMapper userInfoMapper;

    public UserInfo getUser(String loginId, String loginPwd) {
        UserInfo user = userInfoMapper.selectUserByUserId(loginId);
        if(user != null && user.getUserPswd().equals(SHA256.encrypt(loginPwd))) return user;
        return null;
    }


    public int getLoginUserNoByRequest() {
        Object obj = ContextUtils.getRequest().getAttribute(AppConfig.LOGIN_SESS);
        if (obj != null) {
            return (int) obj;
        }

        String uri = ContextUtils.getRequest().getRequestURI();
        if (uri.equals("/api/system/user/save") ||
                uri.equals("/api/user/login")
        ) {
            return 1;
        }
        throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, "login err");
    }

    public UserInfo getByUserNo(int userNo) {
        UserInfo user = userInfoMapper.selectUserByUserNo(userNo);
        return user;
    }

    public UserInfo selectByUserNmAndEmail(String userNm, String email, String s) {
        return null;
    }

    public List<UserInfo> selectUserListPage(UserInfoSearchDto param) {
        return userInfoMapper.selectUserListPage(param);
    }

    public void saveUser(UserInfoSaveDto param) {
        if(param.getUserNo() == 0) {
            param.setUserPswd(SHA256.encrypt(param.getUserPswd()));
            userInfoMapper.insertUser(param);
        }else {
            if(!StringUtils.isEmpty(param.getUserPswd())){
                param.setUserPswd(SHA256.encrypt(param.getUserPswd()));
            }
            userInfoMapper.updateUser(param);
        }
    }

    public UserInfo selectByUserUserId(UserInfoSaveDto param) {
        return userInfoMapper.selectUserByUserId(param.getUserId());
    }

    public void deleteUser(UserInfoDelDto param) {
        userInfoMapper.deleteUserByUserNo(param);
    }
}
