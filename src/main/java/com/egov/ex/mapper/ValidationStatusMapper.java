package com.egov.ex.mapper;
import org.springframework.stereotype.Repository;

import com.egov.ex.dto.ValidationStatusInfoDto;
import com.egov.ex.entity.ValidationStatusInfo;

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
public interface ValidationStatusMapper {

	ValidationStatusInfo selectValidationStatusInfo();   
	
	int updateStartValidationStatusInfo(ValidationStatusInfoDto param);
	
    int updateStopValidationStatusInfo();
    
    int updateCompleteValidationStatusInfo();
	
}
