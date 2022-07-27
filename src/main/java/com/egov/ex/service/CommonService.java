package com.egov.ex.service;

import com.egov.ex.entity.CmmnCdInfo;
import com.egov.ex.entity.Dashboard;
import com.egov.ex.mapper.CmmnCdInfoMapper;
import com.egov.ex.mapper.DashboardMapper;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 상환판 집계 服务实现类
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class CommonService extends EgovAbstractServiceImpl {
    @Resource
    private CmmnCdInfoMapper cmmnCdInfoMapper;

    public List<CmmnCdInfo> selectCmmnCdList(String grpCd) {
       return cmmnCdInfoMapper.selectCmmnCdList(grpCd);
    }

    public List<HashMap> selectMenuList(String pmenuNo) {
        return cmmnCdInfoMapper.selectMenuList(pmenuNo);
    }
}
