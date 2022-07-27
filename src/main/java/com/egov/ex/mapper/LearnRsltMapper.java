package com.egov.ex.mapper;
import com.egov.ex.dto.LearnRsltDto;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;


/**
 * <p>
 * 학습결과 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface LearnRsltMapper {

    int updateLearnRlst(LearnRsltDto param);
}
