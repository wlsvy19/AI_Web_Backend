package com.egov.ex.mapper;
import com.egov.ex.entity.CmmnCdInfo;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 공통 코드 정보 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface CmmnCdInfoMapper  {

    List<CmmnCdInfo> selectCmmnCdList(@Param("grpCd") String grpCd);

    List<HashMap> selectMenuList(@Param("pmenuNo") String pmenuNo);
}
