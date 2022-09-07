package com.egov.ex.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.dto.RpcsValidationStatusInfoDto;
import com.egov.ex.entity.RpcsValidationStatusInfo;
import com.egov.ex.mapper.RpcsValidationStatusMapper;

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
public class RpcsValidationStatusService extends EgovAbstractServiceImpl {

    @Resource
    private RpcsValidationStatusMapper rpcsValidationStatusMapper;

    public RpcsValidationStatusInfo selectRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param) {
        return rpcsValidationStatusMapper.selectRpcsValidationStatusInfo(param);
    }

    public int updateStartRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param) {
        return rpcsValidationStatusMapper.updateStartRpcsValidationStatusInfo(param);
    }
    
    public int updateStopRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param) {
        return rpcsValidationStatusMapper.updateStopRpcsValidationStatusInfo(param);
    }
    
    public int updateCompleteRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param) {
        return rpcsValidationStatusMapper.updateCompleteRpcsValidationStatusInfo(param);
    }
    
    public int updateStepRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param) {
        return rpcsValidationStatusMapper.updateStepRpcsValidationStatusInfo(param);
    }
}
