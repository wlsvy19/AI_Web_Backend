package com.egov.ex.mapper;
import org.springframework.stereotype.Repository;

import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.entity.IncnImg;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
;

/**
 * <p>
 * 꺾임훼손 영상 이미지 정보 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface IncnImgMapper  {
	
	IncnImg selectIncnImgById(CrgwImgSearchData param);

}
