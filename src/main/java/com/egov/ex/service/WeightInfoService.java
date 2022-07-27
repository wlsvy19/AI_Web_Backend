package com.egov.ex.service;

import com.egov.ex.dto.WeightSearchDto;
import com.egov.ex.entity.WeightInfo;
import com.egov.ex.mapper.WeightInfoMapper;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 가중치 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class WeightInfoService extends EgovAbstractServiceImpl {
    @Resource
    private WeightInfoMapper weightInfoMapper;

    public List<WeightInfo> selectWeightInfoList(WeightSearchDto param) {
        return weightInfoMapper.selectWeightInfoList(param);
    }
}
