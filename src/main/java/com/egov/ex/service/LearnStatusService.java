package com.egov.ex.service;

import com.egov.ex.dto.LearnStatusDto;
import com.egov.ex.entity.LearnStatus;
import com.egov.ex.entity.ServerStatus;
import com.egov.ex.mapper.LearnStatusMapper;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

    public LearnStatus selectLearnStatusInfo(LearnStatusDto param) {
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
