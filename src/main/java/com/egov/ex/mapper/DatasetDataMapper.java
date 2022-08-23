package com.egov.ex.mapper;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

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
public interface DatasetDataMapper  {

    List<HashMap> getLabelDataCnt();
    
    List<HashMap> getDatasetDataCnt();
    
}
