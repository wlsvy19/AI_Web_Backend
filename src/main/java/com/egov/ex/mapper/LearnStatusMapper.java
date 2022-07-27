package com.egov.ex.mapper;
import com.egov.ex.dto.LearnStatusDto;
import com.egov.ex.entity.LearnStatus;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;

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

    LearnStatus selectLearnStatusInfo(LearnStatusDto param);

    int insertLearnStatusInfo(LearnStatusDto param);

    int updateStartLearnStatusInfo(LearnStatusDto param);

    int updateStopLearnStatusInfo(LearnStatusDto param);
}
