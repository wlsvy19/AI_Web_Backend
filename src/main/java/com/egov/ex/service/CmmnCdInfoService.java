package com.egov.ex.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.entity.CmmnCdInfo;
import com.egov.ex.mapper.CmmnCdInfoMapper;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * <p>
 * 공통 코드 정보 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class CmmnCdInfoService extends EgovAbstractServiceImpl {
	@Resource
	private CmmnCdInfoMapper cmmnCdInfoMapper;
	
    public List<CmmnCdInfo> selectCmmnCdList(String grpCd) {
        return cmmnCdInfoMapper.selectCmmnCdList(grpCd);
     }
}
