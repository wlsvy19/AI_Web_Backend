package com.egov.ex.mapper;
import org.springframework.stereotype.Repository;

import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.entity.PlateImg;

import egovframework.rte.psl.dataaccess.mapper.Mapper;


/**
 * <p>
 * 정상 번호판 영상 이미지 정보 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface PlateImgMapper  {

	PlateImg selectPlateImgById(CrgwImgSearchData param);

}
