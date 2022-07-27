package com.egov.ex.mapper;
import com.egov.ex.dto.NmrecgClsfDto;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;

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

    void insertNmRecgClsf(NmrecgClsfDto param);
}
