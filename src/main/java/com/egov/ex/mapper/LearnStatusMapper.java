package com.egov.ex.mapper;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.egov.ex.dto.LearnStatusDto;
import com.egov.ex.dto.LearnStatusTempDto;
import com.egov.ex.entity.LearnStatusTemp;

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

    List<LearnStatusTemp> selectLearnStatusInfo(LearnStatusTempDto param);

    int insertLearnStatusInfo(LearnStatusDto param);

    int updateStartLearnStatusInfo(LearnStatusDto param);

    int updateStopLearnStatusInfo(LearnStatusDto param);
}
