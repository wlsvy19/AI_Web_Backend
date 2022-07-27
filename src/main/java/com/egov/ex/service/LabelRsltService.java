package com.egov.ex.service;

import com.egov.ex.dto.LabelRsltSaveDto;
import com.egov.ex.entity.LabelRslt;
import com.egov.ex.mapper.LabelRsltMapper;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 라벨링 결과 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class LabelRsltService extends EgovAbstractServiceImpl {
    @Resource
    private LabelRsltMapper labelRsltMapper;

    public int insertLabelRslt(LabelRslt param) {
       return labelRsltMapper.insertLabelRslt(param);
    }

    public int updateLabelRslt(LabelRslt param) {
       return labelRsltMapper.updateLabelRslt(param);
    }

    public LabelRslt selectLabelRsltById(LabelRslt param) {
        return labelRsltMapper.selectLabelRsltById(param);
    }
}
