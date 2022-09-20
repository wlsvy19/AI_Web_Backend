package com.egov.ex.mapper;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.egov.ex.dto.CommonSearchImgDataDto;
import com.egov.ex.dto.CrgwImgDataSaveData;
import com.egov.ex.dto.CrgwImgDataSearchData;
import com.egov.ex.entity.CrgwImgData;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

/**
 * <p>
 * 차로 영상 데이터 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface CrgwImgDataMapper  {

    List<CrgwImgData> selectCrgwImgDataList(CrgwImgDataSearchData param);

    void updateCrgwImgDataById(CrgwImgDataSaveData param);

    int updateCrgwImgDataDelYnById(CommonSearchImgDataDto param);

    List<CrgwImgData> selectCrgwImgDataListPage(CrgwImgDataSearchData param);

	List<HashMap> selectCrgwImgDataListCount(CrgwImgDataSearchData param);
	
	int updateCrgwImgDataProsYnById(CommonSearchImgDataDto param);
}
