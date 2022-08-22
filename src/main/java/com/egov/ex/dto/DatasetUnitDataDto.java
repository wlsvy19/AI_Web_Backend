package com.egov.ex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 단위데이터 셋, 통합테이터 셋
 */
@Data
@AllArgsConstructor
public class DatasetUnitDataDto {
   private String name; // 문자,숫자,꺽임 ..
   private int unitCnt; // 단위데이터셋 cnt
   private int allCnt; // 통합데이터셋 cnt
}
