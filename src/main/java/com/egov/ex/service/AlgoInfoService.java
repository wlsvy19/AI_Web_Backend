package com.egov.ex.service;

import com.egov.ex.entity.AlgoInfo;
import com.egov.ex.mapper.AlgoInfoMapper;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 알고리즘 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class AlgoInfoService extends EgovAbstractServiceImpl {
    @Resource
    private AlgoInfoMapper algoInfoMapper;

    public List<AlgoInfo> selectAlgoInfoList() {
        return algoInfoMapper.selectAlgoInfoList();
    }
}
