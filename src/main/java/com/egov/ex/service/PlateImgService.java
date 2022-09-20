package com.egov.ex.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.dto.CommonSearchImgDataDto;
import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.entity.PlateImg;
import com.egov.ex.mapper.PlateImgMapper;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * <p>
 * 정상 번호판 영상 이미지 정보 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class PlateImgService extends EgovAbstractServiceImpl {
	
    @Resource
    private PlateImgMapper plateImgMapper;

	
    public PlateImg selectPlateImgById(CrgwImgSearchData param) {
        return plateImgMapper.selectPlateImgById(param);
    }
    
    public int updatePlateImgDelYnByPk(CommonSearchImgDataDto param) {
        return plateImgMapper.updatePlateImgDelYnByPk(param);
    }
    
    public int updatePlateImgProsYnByPk(CommonSearchImgDataDto param) {
        return plateImgMapper.updatePlateImgProsYnByPk(param);
    }
}
