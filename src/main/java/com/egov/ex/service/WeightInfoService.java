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

    public List<WeightInfo> selectWeightInfoListByPage(WeightSearchDto param) {
        return weightInfoMapper.selectWeightInfoListByPage(param); 
    }
    
    public List<WeightInfo> selectWeightInfoListByWeightType(WeightSearchDto param) {
        return weightInfoMapper.selectWeightInfoListByWeightType(param); 
    }
    
    public int deleteWeightInfoByID(WeightSearchDto param) {
        return weightInfoMapper.deleteWeightInfoByID(param); 
    }        
}
