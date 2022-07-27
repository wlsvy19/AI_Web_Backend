package com.egov.ex.service;

import com.egov.ex.dto.CombDtstSearchDto;
import com.egov.ex.entity.CombDtst;
import com.egov.ex.mapper.CombDtstMapper;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 통합 데이터셋 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class CombDtstService extends EgovAbstractServiceImpl {
    @Resource
    private CombDtstMapper combDtstMapper;

    public List<HashMap> selectDtstList(CombDtstSearchDto param) {
       return combDtstMapper.selectDtstList(param);
    }

    public List<HashMap> selectDtstListCount(CombDtstSearchDto param) {
        return combDtstMapper.selectDtstListCount(param);
    }

    public List<CombDtst> selectDtstLearnList(CombDtstSearchDto param) {
        return combDtstMapper.selectDtstLearnList(param);
    }

    public CombDtst selectDtstInfoById(CombDtstSearchDto param) {
        return combDtstMapper.selectDtstInfoById(param);
    }
}
