package com.egov.ex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 단위데이터 셋, 통합테이터 셋
 */
@Data
@AllArgsConstructor
public class DatasetStatusDto {
   private String name; // 문자,숫자,꺽임 ..
   
   private int unitDatasetCnt;
   private int combDatasetCnt;
}
