package com.egov.ex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 라벨링 확정, 라벨링 테이터 셋
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LabelDtrmStatusDto {
   private String name;
   private int confirmDataCnt; // 확정데이터수
   private int stdDatasetCnt; // 기준데이터수
}
