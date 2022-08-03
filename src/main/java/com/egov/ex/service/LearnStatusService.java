package com.egov.ex.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.dto.LearnStatusDto;
import com.egov.ex.dto.LearnStatusInfoDto;
import com.egov.ex.dto.LearnStatusOrgDto;
import com.egov.ex.entity.LearnStatus;
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

    public LearnStatusInfoDto selectLearnStatusInfo() {
    	return learnStatusMapper.selectLearnStatusInfo();
    }
    
    public List<LearnStatus> selectLearnStatus(LearnStatusDto param) {
        return learnStatusMapper.selectLearnStatus(param);
    }

    public int insertLearnStatusOrg(LearnStatusOrgDto param) {
        return learnStatusMapper.insertLearnStatusOrg(param);
    }

    public int updateStartLearnStatusOrg(LearnStatusOrgDto param) {
        return learnStatusMapper.updateStartLearnStatusOrg(param);
    }
    public int updateStopLearnStatusOrg(LearnStatusOrgDto param) {
        return learnStatusMapper.updateStopLearnStatusOrg(param);
    }
}
