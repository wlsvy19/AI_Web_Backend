package com.egov.ex.mapper;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.dto.RpcsValidationResultDto;
import com.egov.ex.entity.RpcsValidationResult;

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
public interface RpcsValidationResultMapper {
	
	List<RpcsValidationResult> selectRpcsValidationResult(RpcsValidationResultDto param);
	
	RpcsValidationResult selectRpcsImgByPk(RpcsValidationResultDto param);
	
	HashMap countIsCorrect(RpcsValidationResultDto param);
	
	int deleteRpcsValidationResultAll();
    
}
