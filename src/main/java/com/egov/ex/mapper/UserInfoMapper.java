package com.egov.ex.mapper;
import com.egov.ex.dto.UserInfoDelDto;
import com.egov.ex.dto.UserInfoSaveDto;
import com.egov.ex.dto.UserInfoSearchDto;
import com.egov.ex.entity.UserInfo;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 사용자 정보 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface UserInfoMapper  {

    UserInfo selectUserByUserId(@Param("loginId") String loginId);

    UserInfo selectUserByUserNo(@Param("userNo") int userNo);

    List<UserInfo> selectUserListPage(UserInfoSearchDto param);

    void insertUser(UserInfoSaveDto param);

    void updateUser(UserInfoSaveDto param);

    void deleteUserByUserNo(UserInfoDelDto param);
}
