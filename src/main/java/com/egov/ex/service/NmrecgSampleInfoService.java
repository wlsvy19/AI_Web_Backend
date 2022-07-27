package com.egov.ex.service;

import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.dto.NmrecGSampleSearchDto;
import com.egov.ex.entity.NmrecgSampleInfo;
import com.egov.ex.mapper.NmrecgSampleInfoMapper;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 미오인식 유형 샘플 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class NmrecgSampleInfoService extends EgovAbstractServiceImpl {
    @Resource
    private NmrecgSampleInfoMapper nmrecgSampleInfoMapper;

    public NmrecgSampleInfo selectNmrecgSampleInfoDataByCmmnCd(NmrecGSampleSearchDto param) {
       return nmrecgSampleInfoMapper.selectNmrecgSampleInfoDataByCmmnCd(param);
    }
}
