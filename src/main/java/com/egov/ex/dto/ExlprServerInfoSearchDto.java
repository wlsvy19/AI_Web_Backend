package com.egov.ex.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ExlprServerInfoSearchDto extends Page {
    private String hdqrNm; //  본부,수도권
}
