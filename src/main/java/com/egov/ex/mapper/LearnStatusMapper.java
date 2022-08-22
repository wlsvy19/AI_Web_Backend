package com.egov.ex.mapper;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.egov.ex.dto.LearnStatusDto;
import com.egov.ex.dto.LearnStatusInfoDto;
import com.egov.ex.entity.LearnStatus;
import com.egov.ex.entity.LearnStatusInfo;

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
public interface LearnStatusMapper {

	LearnStatusInfo selectLearnStatusInfo(); 
	
    List<LearnStatus> selectLearnStatus(LearnStatusDto param);

	int updateStartLearnStatusInfo(LearnStatusInfoDto param);
    
    int updateStopLearnStatusInfo();
    
    int updateCompleteLearnStatusInfo();
}
