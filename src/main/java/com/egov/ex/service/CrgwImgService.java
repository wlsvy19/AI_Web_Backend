package com.egov.ex.service;

import com.egov.ex.dto.CombDtstSearchDto;
import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.mapper.CrgwImgMapper;
import com.egov.ex.entity.CrgwImg;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
}
