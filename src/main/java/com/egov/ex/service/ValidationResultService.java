package com.egov.ex.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.dto.ValidationResultDto;
import com.egov.ex.entity.ValidationResult;
import com.egov.ex.mapper.ValidationResultMapper;

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
public class ValidationResultService extends EgovAbstractServiceImpl {

    @Resource
    private ValidationResultMapper validationResultMapper;

    public List<ValidationResult> selectValidationResultById(ValidationResultDto param) {
        return validationResultMapper.selectValidationResultById(param);
    }
    
    public int selectValidationResultCountById(ValidationResultDto param) {
        return validationResultMapper.selectValidationResultCountById(param);
    }
    
}
