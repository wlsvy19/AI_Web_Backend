package com.egov.ex.mapper;
import org.springframework.stereotype.Repository;

import com.egov.ex.dto.CommonSearchImgDataDto;
import com.egov.ex.dto.NmrecgClsfDto;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

/**
 * <p>
 * 미오인식 유형분류 결과 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface NmrecgClsfMapper {

    int updateNmRecgClsf(NmrecgClsfDto param);

    int updateNmrecgClsfDelYnById(CommonSearchImgDataDto param);
    
    void insertNmRecgClsf(NmrecgClsfDto param);
    
    int updateNmrecgClsfProsYnById(CommonSearchImgDataDto param);
}
