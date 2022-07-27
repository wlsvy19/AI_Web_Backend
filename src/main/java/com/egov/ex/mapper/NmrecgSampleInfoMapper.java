package com.egov.ex.mapper;
import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.dto.NmrecGSampleSearchDto;
import com.egov.ex.entity.NmrecgSampleInfo;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;


/**
 * <p>
 * 미오인식 유형 샘플 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface NmrecgSampleInfoMapper  {

    NmrecgSampleInfo selectNmrecgSampleInfoDataByCmmnCd(NmrecGSampleSearchDto param);
}
