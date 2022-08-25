package com.egov.ex.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egov.ex.dto.AjaxResp;
import com.egov.ex.dto.DatasetStatusDto;
import com.egov.ex.dto.DatasetStdSaveDto;
import com.egov.ex.dto.DatasetUnitSearchDto;
import com.egov.ex.dto.LabelClassDto;
import com.egov.ex.dto.LabelDto;
import com.egov.ex.dto.LabelDtrmStatusDto;
import com.egov.ex.entity.CmmnCdInfo;
import com.egov.ex.service.CommonService;
import com.egov.ex.service.DatasetDataService;

import io.swagger.annotations.Api;

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
    private DatasetDataService datasetService;   

    @Resource
    private CommonService commonService;


    /**
     * 학습데이터 셋 > 학습데이터 셋 현황
     * DatasetDataDto 라벨링 확정, 라벨링데이터 현황
     * DatasetUnitDataDto 단위데이터 셋, 통합데이터 셋
     * @return
     * @throws Exception
     */
    // 학습 데이터 셋 통계
    @PostMapping("/api/dtst/study/info")
    public AjaxResp dtstStudy() throws Exception{
        // 1. 라벨링 확정 데이터 현황, 2.라벨링 데이터 현황
        Map resultMap = new HashMap();

		ArrayList<LabelDtrmStatusDto> dataList = new ArrayList<LabelDtrmStatusDto>();

		List<HashMap> list = datasetService.getLabelDataCnt();
		for (int i = 0; i < list.size(); i++) {
			LabelDtrmStatusDto d = new LabelDtrmStatusDto(list.get(i).get("name").toString(),
					Integer.parseInt((String) list.get(i).get("confirmDataCnt").toString()),
					Integer.parseInt((String) list.get(i).get("stdDatasetCnt").toString()));
			dataList.add(d);
		}
		int labelSum = dataList.stream().mapToInt(i -> i.getConfirmDataCnt()).sum();
		int labelAllsum = dataList.stream().mapToInt(i -> i.getStdDatasetCnt()).sum();
		
		resultMap.put("labelConfirmList", dataList);
		resultMap.put("labelConfirmSum", labelSum); // 확정 데이터 카운트
		resultMap.put("labelAllSum", labelAllsum); // 라벨 데이터 카운트
		
		list.clear();
		
		ArrayList<DatasetStatusDto> dataList2 = new ArrayList<DatasetStatusDto>();
		
		list = datasetService.getDatasetDataCnt();
		for (int i = 0; i < list.size(); i++) {
			DatasetStatusDto d = new DatasetStatusDto(list.get(i).get("name").toString(),
					Integer.parseInt((String) list.get(i).get("unitDatasetCnt").toString()),
					Integer.parseInt((String) list.get(i).get("combDatasetCnt").toString()));
			dataList2.add(d);
		}
		int unitSum = dataList2.stream().mapToInt(i -> i.getUnitDatasetCnt()).sum();
		int allSum = dataList2.stream().mapToInt(i -> i.getCombDatasetCnt()).sum();
		
		resultMap.put("datasetList", dataList2);
		resultMap.put("datasetUnitSum", unitSum); // 확정 데이터 카운트
		resultMap.put("datasetAllSum", allSum); // 라벨 데이터 카운트

        return AjaxResp.success(resultMap);
    }
    
    /**
     * 단위 데이터 셋 통계
     * @param param
     * @return
     * @throws Exception
     */
    @PostMapping("/api/dtst/unit/info")
    public AjaxResp dtstUnit(DatasetUnitSearchDto param) throws Exception{
        Map data = new HashMap();
        int sum = 0; // 총개수
        int stdDtstCnt = 0; // 단위데이터셋 기준개수
        List<LabelDto> labelList = new ArrayList<>(); // 번호판, 문자/숫자1,.... 에 대한 데이터리스트
        LabelDtrmStatusDto confirmDataset = new LabelDtrmStatusDto(); //라벨링 확정 데이터 현황labelList
        List<LabelClassDto> labelClassDataList = new ArrayList<>();// 라벨링 클래스 별 데이터 현황
        
        System.out.println("#######################################" + param);

        try {stdDtstCnt = Integer.parseInt(commonService.selectCmmnCdList("STD_DTST_CNT").get(0).getCmmnCd());}catch (Exception e) {};
        List<CmmnCdInfo> list = commonService.selectCmmnCdList("NUM_BTN"); // 라벨링 리스트
        for(CmmnCdInfo cd: list) {
            int count = 1000;// TODO: CD로 DB에서 가져오기
            sum += count;
            labelList.add(LabelDto.builder()
                    .code(cd.getCmmnCd())
                    .name(cd.getCmmnCdNm())
                    .cnt(count)
                    .build()
            );
        }

        labelClassDataList = Arrays.asList(
                  new LabelClassDto("A", 30000)
                , new LabelClassDto("B", 60000)
                , new LabelClassDto("C", 90000)
                , new LabelClassDto("D", 120000)
                , new LabelClassDto("E", 150000)
        ); // TODO: DB에서 라벨링별 데이터 현황을 가져와서 리스트에 넣어주기

        data.put("sum", sum); // 라벨총갯수
        data.put("stdDtstCnt", stdDtstCnt); // 기준개수
        data.put("labelList", labelList); // 라벨리스트
        data.put("confirmDataset", confirmDataset); // 확정 데이터
        data.put("labelClassDataList", labelClassDataList); // 라벨링 클라스 데이터 현황

        return AjaxResp.success(data);
    }

    /**
     * 자동 데이터셋 설정 저장
     * @return
     * @throws Exception
     */
    @PostMapping("/api/dtst/unit/save/stddtst")
    public AjaxResp dtstUnitSaveStdSetting(DatasetStdSaveDto param) throws Exception{
        // TODO: DB저장 로직
        return AjaxResp.success();
    }

    /**
     * 자동 데이터셋 생성
     * @param param
     * @return
     * @throws Exception
     */
    @PostMapping("/api/dtst/unit/new/dataset")
    public AjaxResp dtstUnitcreateDataset(DatasetUnitSearchDto param) throws Exception{
        // TODO: DB저장 로직
        return AjaxResp.success();
    }
}
