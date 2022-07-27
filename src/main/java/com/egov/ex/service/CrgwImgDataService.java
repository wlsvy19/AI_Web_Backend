package com.egov.ex.service;

import com.egov.ex.dto.CrgwImgDataSaveData;
import com.egov.ex.dto.CrgwImgDataSearchData;
import com.egov.ex.entity.CrgwImgData;
import com.egov.ex.mapper.CrgwImgDataMapper;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 차로 영상 데이터 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class CrgwImgDataService extends EgovAbstractServiceImpl {
    @Resource
    private CrgwImgDataMapper crgwImgDataMapper;

    public List<CrgwImgData> selectCrgwImgDataList(CrgwImgDataSearchData param) {
       return crgwImgDataMapper.selectCrgwImgDataList(param);
    }

    public void updateCrgwImgDataById(CrgwImgDataSaveData param) {
        crgwImgDataMapper.updateCrgwImgDataById(param);
    }

    public void updateCrgwImgDataDelYnById(CrgwImgDataSaveData param) {
        crgwImgDataMapper.updateCrgwImgDataDelYnById(param);
    }

    public List<CrgwImgData> selectCrgwImgDataListPage(CrgwImgDataSearchData param) {
        return crgwImgDataMapper.selectCrgwImgDataListPage(param);
    }
}
