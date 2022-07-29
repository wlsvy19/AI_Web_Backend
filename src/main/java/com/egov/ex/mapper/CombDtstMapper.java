package com.egov.ex.mapper;
import com.egov.ex.dto.CombDtstSearchDto;
import com.egov.ex.entity.CombDtst;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 통합 데이터셋 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface CombDtstMapper  {

    List<CombDtst> selectDtstList(CombDtstSearchDto param);

    List<HashMap> selectDtstListCount(CombDtstSearchDto param);

    List<CombDtst> selectDtstLearnList(CombDtstSearchDto param);

    CombDtst selectDtstInfoById(CombDtstSearchDto param);
}
