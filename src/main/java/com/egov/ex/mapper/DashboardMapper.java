package com.egov.ex.mapper;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.egov.ex.entity.Dashboard;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
;

/**
 * <p>
 * 상환판 집계 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface DashboardMapper  {

    Dashboard selectDashboardByTerm();
    
    List<HashMap> selectNmrecg();
}
