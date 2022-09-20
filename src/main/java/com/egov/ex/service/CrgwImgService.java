package com.egov.ex.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.dto.CommonSearchImgDataDto;
import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.entity.CrgwImg;
import com.egov.ex.mapper.CrgwImgMapper;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * <p>
 * 차로 영상 이미지 정보 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class CrgwImgService extends EgovAbstractServiceImpl {
    @Resource
    private CrgwImgMapper crgwImgMapper;

    public List<CrgwImg> selectList() {
        String name = "11";
        return crgwImgMapper.selectList(name);
    }

    public CrgwImg selectCrgwImgById(CrgwImgSearchData param) {
        return crgwImgMapper.selectCrgwImgById(param);
    }

    public List<CrgwImg> selectCrgwImgList(CrgwImgSearchData param) {
        return crgwImgMapper.selectCrgwImgList(param);
    }
    
    public int updateCrgwImgDelYnById(CommonSearchImgDataDto param) {
    	return crgwImgMapper.updateCrgwImgDelYnById(param);
    }
}
