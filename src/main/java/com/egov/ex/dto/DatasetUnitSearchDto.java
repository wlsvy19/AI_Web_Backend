package com.egov.ex.dto;

import lombok.Data;

/**
 * 단위데이터셋 검색
 */
@Data
public class DatasetUnitSearchDto extends Page{
   private String name; // 문자,숫자,꺽임 ..
   private String code; // 코드

   private String dtstId;
}




