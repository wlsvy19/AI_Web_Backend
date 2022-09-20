package com.egov.ex.mapper;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.egov.ex.dto.ValidationResultDto;
import com.egov.ex.entity.ValidationResult;

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
public interface ValidationResultMapper {

	List<ValidationResult> selectValidationResultById(ValidationResultDto param);   
	
	HashMap selectValidationResultCountById(ValidationResultDto param);
	
	int updateValidationResultByPk(ValidationResultDto param);
	
	int updateValidationResultDelYnByPk(ValidationResultDto param);
	
}
