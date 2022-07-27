package com.egov.ex.mapper;
import com.egov.ex.dto.StatLabelSearchData;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


/**
 * <p>
 * 통계 Mapper
 * </p>
 *
 * @author  
 * @since 2022-07-01
 */
@Mapper
@Repository
public interface StatMapper {

    HashMap<String, Object> selectStdtDtstData(StatLabelSearchData param);
}
