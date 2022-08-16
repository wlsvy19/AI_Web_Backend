package com.egov.ex.mapper;
import com.egov.ex.entity.LabelRslt;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;

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

    LabelRslt selectLabelRsltById(LabelRslt param);

    void updateLabelRsltDel(LabelRslt param);
}
