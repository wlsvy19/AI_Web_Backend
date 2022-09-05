package com.egov.ex.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.dto.ValidationStatusInfoDto;
import com.egov.ex.entity.ValidationStatusInfo;
import com.egov.ex.mapper.ValidationStatusMapper;

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
public class ValidationStatusService extends EgovAbstractServiceImpl {

    @Resource
    private ValidationStatusMapper validationStatusMapper;

    public ValidationStatusInfo selectValidationStatusInfo(ValidationStatusInfoDto param) {
        return validationStatusMapper.selectValidationStatusInfo(param);
    }

    public int updateStartValidationStatusInfo(ValidationStatusInfoDto param) {
        return validationStatusMapper.updateStartValidationStatusInfo(param);
    }
    
    public int updateStopValidationStatusInfo(ValidationStatusInfoDto param) {
        return validationStatusMapper.updateStopValidationStatusInfo(param);
    }
    
    public int updateCompleteValidationStatusInfo(ValidationStatusInfoDto param) {
        return validationStatusMapper.updateCompleteValidationStatusInfo(param);
    }
    
    public int updateStepValidationStatusInfo(ValidationStatusInfoDto param) {
        return validationStatusMapper.updateStepValidationStatusInfo(param);
    }
}
