package com.egov.ex.service;

import com.egov.ex.dto.LearnHisSearchDto;
import com.egov.ex.dto.LearnRsltDto;
import com.egov.ex.mapper.LearnRsltMapper;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 * 학습결과 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class LearnRsltService extends EgovAbstractServiceImpl {
    @Resource
    private LearnRsltMapper learnRsltMapper;

    public int updateLearnRlst(LearnRsltDto param) {
        return learnRsltMapper.updateLearnRlst(param);
    }
}
