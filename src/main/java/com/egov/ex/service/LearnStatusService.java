package com.egov.ex.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.dto.LearnStatusDto;
import com.egov.ex.dto.LearnStatusInfoDto;
import com.egov.ex.entity.LearnStatus;
import com.egov.ex.entity.LearnStatusInfo;
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

    public LearnStatusInfo selectLearnStatusInfo() {
    	return learnStatusMapper.selectLearnStatusInfo();
    }
    
    public List<LearnStatus> selectLearnStatus(LearnStatusDto param) {
        return learnStatusMapper.selectLearnStatus(param);
    }

    public int updateStartLearnStatusInfo(LearnStatusInfoDto param) {
        return learnStatusMapper.updateStartLearnStatusInfo(param);
    }
    
    public int updateStopLearnStatusInfo() {
        return learnStatusMapper.updateStopLearnStatusInfo();
    }
    
    public int updateCompeleteLearnStatusInfo() {
        return learnStatusMapper.updateCompleteLearnStatusInfo();
    }
}
