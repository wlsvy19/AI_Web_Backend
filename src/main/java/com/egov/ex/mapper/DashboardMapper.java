package com.egov.ex.mapper;
import com.egov.ex.entity.Dashboard;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;
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
}
