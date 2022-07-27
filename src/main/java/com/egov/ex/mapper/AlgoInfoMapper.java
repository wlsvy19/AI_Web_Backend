package com.egov.ex.mapper;
import com.egov.ex.entity.AlgoInfo;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 알고리즘 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface AlgoInfoMapper {

    List<AlgoInfo> selectAlgoInfoList();
}
