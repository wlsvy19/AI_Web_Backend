package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class NmrecGSampleSearchDto {
	private String grpCd;
    private String cmmnCd;
}
