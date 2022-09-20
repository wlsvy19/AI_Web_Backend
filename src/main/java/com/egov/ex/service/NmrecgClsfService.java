package com.egov.ex.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.dto.CommonSearchImgDataDto;
import com.egov.ex.dto.NmrecgClsfDto;
import com.egov.ex.mapper.NmrecgClsfMapper;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * <p>
 * 미오인식 유형분류 결과 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class NmrecgClsfService extends EgovAbstractServiceImpl {
    @Resource
    private NmrecgClsfMapper nmrecgClsfMapper;

    public int updateNmRecgClsf(NmrecgClsfDto param) {
        return nmrecgClsfMapper.updateNmRecgClsf(param);
    }

    public int updateNmrecgClsfDelYnById(CommonSearchImgDataDto param) {
        return nmrecgClsfMapper.updateNmrecgClsfDelYnById(param);
    }
    
    public void insertNmRecgClsf(NmrecgClsfDto param) {
        nmrecgClsfMapper.insertNmRecgClsf(param);
    }
    
    public int updateNmrecgClsfProsYnById(CommonSearchImgDataDto param) {
        return nmrecgClsfMapper.updateNmrecgClsfProsYnById(param);
    }    
}
