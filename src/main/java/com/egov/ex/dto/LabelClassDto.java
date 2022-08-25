package com.egov.ex.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 라벨링 클라스별 갯수
 */
@Data
@AllArgsConstructor
@Builder
public class LabelClassDto {
   private String code; // 라벨링클라스별 코드
//   private String name; // 라벨링 클라스 이름 ? 없으면 무시
   private int cnt; // 100,200
}
