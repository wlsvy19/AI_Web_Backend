package com.egov.ex.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.egov.ex.dto.CommonSearchImgDataDto;
import com.egov.ex.dto.CrgwImgSearchData;
import com.egov.ex.entity.CrgwImg;

import egovframework.rte.psl.dataaccess.mapper.Mapper;


/**
 * <p>
 * 차로 영상 이미지 정보 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface CrgwImgMapper  {

    List<CrgwImg> selectList(@Param("name") String name);

    CrgwImg selectCrgwImgById(CrgwImgSearchData param);

    List<CrgwImg> selectCrgwImgList(CrgwImgSearchData param);
    
    int updateCrgwImgDelYnById(CommonSearchImgDataDto param);
}
