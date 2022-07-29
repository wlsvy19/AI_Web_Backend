package com.egov.ex.mapper;
import com.egov.ex.dto.ExlprServerInfoSearchDto;
import com.egov.ex.dto.UnitDtstSearchDto;
import com.egov.ex.entity.ExlprServerInfo;
import com.egov.ex.entity.UnitDtst;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * <p>
 * 단위 데이터셋 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface UnitDtstMapper {

    List<UnitDtst> selectUnitDtstList(UnitDtstSearchDto param);

    List<ExlprServerInfo> updtList(ExlprServerInfoSearchDto param);

	List<UnitDtst> selectUnitDtstListById(UnitDtstSearchDto param);
}
