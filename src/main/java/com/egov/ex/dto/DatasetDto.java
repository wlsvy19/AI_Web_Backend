package com.egov.ex.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 라벨링 갯수
 */
@Data
@AllArgsConstructor
@Builder
public class DatasetDto {
   private String workDate;  // 생성일자
   private String combDtstId;  // 통합데이터셋ID
   private int totalCnt; // 총 데이터셋개수
   private int unitCnt; // 단위 데이터셋개수
}
