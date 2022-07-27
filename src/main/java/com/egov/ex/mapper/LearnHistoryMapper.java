package com.egov.ex.mapper;
import com.egov.ex.dto.LearnHisSearchDto;
import com.egov.ex.entity.LearnHistory;
import com.github.pagehelper.PageInfo;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 학습이력 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface LearnHistoryMapper  {

    List<LearnHistory> selectLearnHistoryListPage(LearnHisSearchDto param);
}
