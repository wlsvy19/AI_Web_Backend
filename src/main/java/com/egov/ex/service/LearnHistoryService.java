package com.egov.ex.service;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.LearnHisSearchDto;
import com.egov.ex.dto.Page;
import com.egov.ex.dto.ServerStatusDto;
import com.egov.ex.entity.LearnHistory;
import com.egov.ex.mapper.LearnHistoryMapper;
import com.egov.ex.mapper.LearnStatusMapper;
import com.egov.ex.util.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 학습이력 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class LearnHistoryService extends EgovAbstractServiceImpl {

    @Resource
    private LearnHistoryMapper learnHistoryMapper;

    public List<LearnHistory> selectLearnHistoryListPage(LearnHisSearchDto param) {
        return learnHistoryMapper.selectLearnHistoryListPage(param);
    }
}
