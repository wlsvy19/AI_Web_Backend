package com.egov.ex.mapper;
import org.springframework.stereotype.Repository;

import com.egov.ex.dto.CommonSearchImgDataDto;
import com.egov.ex.dto.SearchLabelRsltDto;
import com.egov.ex.entity.LabelRslt;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

/**
 * <p>
 * 라벨링 결과 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface LabelRsltMapper  {

    int insertLabelRslt(LabelRslt param);

    int updateLabelRslt(LabelRslt param);

    LabelRslt selectLabelRsltById(SearchLabelRsltDto param);

    void updateLabelRsltDel(LabelRslt param);
    
    int deleteLabelRsltById(CommonSearchImgDataDto param);
}
