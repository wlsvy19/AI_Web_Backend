package com.egov.ex.mapper;
import org.springframework.stereotype.Repository;

import com.egov.ex.dto.RpcsValidationStatusInfoDto;
import com.egov.ex.entity.RpcsValidationStatusInfo;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

/**
 * <p>
 * 학습 상태 모니터링 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface RpcsValidationStatusMapper {

	RpcsValidationStatusInfo selectRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param);   
	
	int updateStartRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param);
	
    int updateStopRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param);
    
    int updateCompleteRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param);
    
    int updateStepRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param);
    
}
