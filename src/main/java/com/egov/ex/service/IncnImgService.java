package com.egov.ex.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.entity.IncnImg;
import com.egov.ex.mapper.IncnImgMapper;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * <p>
 * 꺾임훼손 영상 이미지 정보 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class IncnImgService extends EgovAbstractServiceImpl {
    @Resource
    private IncnImgMapper incnImgMapper;

	
    public IncnImg selectIncnImgById(CrgwImgSearchData param) {
        return incnImgMapper.selectIncnImgById(param);
    }
    
}
