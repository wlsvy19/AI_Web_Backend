package com.egov.ex.controller;


import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.DatasetLabelDataDto;
import com.egov.ex.dto.DatasetUnitDataDto;
import com.egov.ex.dto.StatLabelSearchData;
import com.egov.ex.service.StatService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * <p>
 * 학습,단위,통합 데이터셋 관련 API
 * </p>
 *
 * @author  
 * @since 2022-08-22
 */
@Api(tags = "20.데이터셋")
@RestController
public class DatasetController {

    @Resource
    private StatService ststService;

    /**
     * 학습데이터 셋 > 학습데이터 셋 현황
     * DatasetLabelDataDto 라벨링 확정, 라벨링데이터 현황
     * DatasetUnitDataDto 단위데이터 셋, 통합데이터 셋
     * @return
     * @throws Exception
     */
    // 학습 데이터 셋 통계
    @PostMapping("/api/dtst/study/info")
    public AjaxResp dtstStudy() throws Exception{
        // 1. 라벨링 확정 데이터 현황, 2.라벨링 데이터 현황
        Map data = new HashMap();
        DatasetLabelDataDto d1 = new DatasetLabelDataDto("번호판탐색",5000,10000); // TODO: DB에서 가져오기
        DatasetLabelDataDto d2 = new DatasetLabelDataDto("문자/숫자1",4000,8000); // TODO: DB에서 가져오기
        DatasetLabelDataDto d3 = new DatasetLabelDataDto("문자/숫자2",3000,6000);// TODO: DB에서 가져오기
        DatasetLabelDataDto d4 = new DatasetLabelDataDto("문자/숫자3",2000,20000);// TODO: DB에서 가져오기
        DatasetLabelDataDto d5 = new DatasetLabelDataDto("꺾임/훼손",2000,50000);// TODO: DB에서 가져오기
        DatasetLabelDataDto d6 = new DatasetLabelDataDto("스미어",4000,7000);// TODO: DB에서 가져오기
        List<DatasetLabelDataDto> labels = Arrays.asList(d1, d2, d3, d4, d5, d6); //라벨 확정테이터
        int labelSum = labels.stream().mapToInt(i->i.getConfirmDataCnt()).sum();
        int labelAllsum = labels.stream().mapToInt(i->i.getAllDataCnt()).sum();
        data.put("labelConfirmList", labels);
        data.put("labelConfirmSum", labelSum); //확정 데이터 카운트
        data.put("labelAllSum", labelAllsum); // 라벨 데이터 카운트

        // 2. 단위데이터 셋 현황, 통합 데이터셋 현황
        DatasetUnitDataDto s1 = new DatasetUnitDataDto("번호판탐색",3200,5000);// TODO: DB에서 가져오기
        DatasetUnitDataDto s2 = new DatasetUnitDataDto("문자/숫자1",8000,9000);// TODO: DB에서 가져오기
        DatasetUnitDataDto s3 = new DatasetUnitDataDto("문자/숫자2",3000,5800);// TODO: DB에서 가져오기
        DatasetUnitDataDto s4 = new DatasetUnitDataDto("문자/숫자3",5000,5400);// TODO: DB에서 가져오기
        DatasetUnitDataDto s5 = new DatasetUnitDataDto("꺾임/훼손",7000,8000);// TODO: DB에서 가져오기
        DatasetUnitDataDto s6 = new DatasetUnitDataDto("스미어",4000,5000);// TODO: DB에서 가져오기
        List<DatasetUnitDataDto> datasetList= Arrays.asList(s1, s2, s3, s4, s5, s6); //단위, 통합
        int unitSum = datasetList.stream().mapToInt(i->i.getUnitCnt()).sum(); //유닛 데이터 셋 카운트
        int allSum = datasetList.stream().mapToInt(i->i.getAllCnt()).sum(); // 통합 데이터 셋 카운트
        data.put("datasetList", datasetList);
        data.put("datasetUnitSum", unitSum);
        data.put("datasetAllSum", allSum);

        return AjaxResp.success(data);
    }

}
