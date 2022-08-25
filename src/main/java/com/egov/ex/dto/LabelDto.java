package com.egov.ex.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 라벨링 갯수
 */
@Data
@AllArgsConstructor
@Builder
public class LabelDto {
   private String code; // 1,2
   private String name; // P1,P2 ..
   private int cnt; // 100,200
}
