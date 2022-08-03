package com.egov.ex.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.dto.LearnStatusDto;
import com.egov.ex.dto.LearnStatusTempDto;
import com.egov.ex.entity.LearnStatusTemp;
import com.egov.ex.mapper.LearnStatusMapper;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * <p>
 * 학습 상태 모니터링 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class LearnStatusService extends EgovAbstractServiceImpl {

    @Resource
    private LearnStatusMapper learnStatusMapper;

    public List<LearnStatusTemp> selectLearnStatusInfo(LearnStatusTempDto param) {
        return learnStatusMapper.selectLearnStatusInfo(param);
    }

    public int insertLearnStatusInfo(LearnStatusDto param) {
        return learnStatusMapper.insertLearnStatusInfo(param);
    }

    public int updateStartLearnStatusInfo(LearnStatusDto param) {
        return learnStatusMapper.updateStartLearnStatusInfo(param);
    }
    public int updateStopLearnStatusInfo(LearnStatusDto param) {
        return learnStatusMapper.updateStopLearnStatusInfo(param);
    }
}
