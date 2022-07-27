package com.egov.ex.service;

import com.egov.ex.dto.StatLabelSearchData;
import com.egov.ex.entity.CmmnCdInfo;
import com.egov.ex.mapper.CmmnCdInfoMapper;
import com.egov.ex.mapper.StatMapper;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
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
public class StatService extends EgovAbstractServiceImpl {
    @Resource
    private StatMapper statMapper;

    public HashMap<String, Object> selectStdtDtstData(StatLabelSearchData param) {
        return statMapper.selectStdtDtstData(param);
    }
}
