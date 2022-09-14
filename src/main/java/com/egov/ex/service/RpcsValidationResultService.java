package com.egov.ex.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.dto.RpcsValidationResultDto;
import com.egov.ex.entity.RpcsValidationResult;
import com.egov.ex.mapper.RpcsValidationResultMapper;

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
public class RpcsValidationResultService extends EgovAbstractServiceImpl {

    @Resource	
    private RpcsValidationResultMapper rpcsValidationResultMapper;
    
    public List<RpcsValidationResult> selectRpcsValidationResult(RpcsValidationResultDto param) {
    	return rpcsValidationResultMapper.selectRpcsValidationResult(param);
    }
    
    public RpcsValidationResult selectRpcsImgByPk(RpcsValidationResultDto param) {
    	return rpcsValidationResultMapper.selectRpcsImgByPk(param);
    }
    
    public HashMap countIsCorrect(RpcsValidationResultDto param) {
    	return rpcsValidationResultMapper.countIsCorrect(param);
    }
    
    public int deleteRpcsValidationResultAll() {
    	return rpcsValidationResultMapper.deleteRpcsValidationResultAll();
    }
}
