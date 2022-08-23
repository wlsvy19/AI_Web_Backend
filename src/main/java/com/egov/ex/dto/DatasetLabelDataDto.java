package com.egov.ex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 라벨링 확정, 라벨링 테이터 셋
 */
@Data
@AllArgsConstructor
public class DatasetLabelDataDto {
   private String name;
   private int confirmDataCnt; // 확정데이터
   private int allDataCnt; // 총데이터
}
