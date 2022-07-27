package com.egov.ex.mapper;
import com.egov.ex.dto.CrgwImgDataSaveData;
import com.egov.ex.dto.CrgwImgDataSearchData;
import com.egov.ex.entity.CrgwImgData;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    void updateCrgwImgDataDelYnById(CrgwImgDataSaveData param);

    List<CrgwImgData> selectCrgwImgDataListPage(CrgwImgDataSearchData param);
}
