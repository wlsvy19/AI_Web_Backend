package com.egov.ex.mapper;
import com.egov.ex.dto.WeightSearchDto;
import com.egov.ex.entity.WeightInfo;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 가중치 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface WeightInfoMapper {

    List<WeightInfo> selectWeightInfoListByPage(WeightSearchDto param);
    
    List<WeightInfo> selectWeightInfoListByWeightType(WeightSearchDto param);
    
    int deleteWeightInfoByID(WeightSearchDto param);
}
