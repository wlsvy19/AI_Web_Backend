package com.egov.ex.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 라벨링 결과
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="LabelRslt", description="라벨링 결과")
public class LabelRslt {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "라벨링메뉴")
    private String pageType;
    
    @ApiModelProperty(value = "생성일자")
    private String workDate;

    @ApiModelProperty(value = "생성순번")
    private String workNo;

    @ApiModelProperty(value = "라벨링유형")
    private String labelType;

    @ApiModelProperty(value = "라벨링데이터텍스트")
    private String labelDataText;

    @ApiModelProperty(value = "클래스유형1")
    private String class1;

    @ApiModelProperty(value = "클래스유형1좌표")
    private String class1Crdnt;

    @ApiModelProperty(value = "클래스유형2")
    private String class2;

    @ApiModelProperty(value = "클래스유형2좌표")
    private String class2Crdnt;

    @ApiModelProperty(value = "클래스유형3")
    private String class3;

    @ApiModelProperty(value = "클래스유형3좌표")
    private String class3Crdnt;

    @ApiModelProperty(value = "클래스유형4")
    private String class4;

    @ApiModelProperty(value = "클래스유형4좌표")
    private String class4Crdnt;

    @ApiModelProperty(value = "클래스유형5")
    private String class5;

    @ApiModelProperty(value = "클래스유형5좌표")
    private String class5Crdnt;

    @ApiModelProperty(value = "클래스유형6")
    private String class6;

    @ApiModelProperty(value = "클래스유형6좌표")
    private String class6Crdnt;

    @ApiModelProperty(value = "클래스유형7")
    private String class7;

    @ApiModelProperty(value = "클래스유형7좌표")
    private String class7Crdnt;

    @ApiModelProperty(value = "클래스유형8")
    private String class8;

    @ApiModelProperty(value = "클래스유형8좌표")
    private String class8Crdnt;

    @ApiModelProperty(value = "클래스유형9")
    private String class9;

    @ApiModelProperty(value = "클래스유형9좌표")
    private String class9Crdnt;

    @ApiModelProperty(value = "클래스유형10")
    private String class10;

    @ApiModelProperty(value = "클래스유형10좌표")
    private String class10Crdnt;

    @ApiModelProperty(value = "클래스유형11")
    private String class11;

    @ApiModelProperty(value = "클래스유형11좌표")
    private String class11Crdnt;

    @ApiModelProperty(value = "클래스유형12")
    private String class12;

    @ApiModelProperty(value = "클래스유형12좌표")
    private String class12Crdnt;

    @ApiModelProperty(value = "클래스유형13")
    private String class13;

    @ApiModelProperty(value = "클래스유형13좌표")
    private String class13Crdnt;

    @ApiModelProperty(value = "클래스유형14")
    private String class14;

    @ApiModelProperty(value = "클래스유형14좌표")
    private String class14Crdnt;

    @ApiModelProperty(value = "클래스유형15")
    private String class15;

    @ApiModelProperty(value = "클래스유형15좌표")
    private String class15Crdnt;

    @ApiModelProperty(value = "클래스유형16")
    private String class16;

    @ApiModelProperty(value = "클래스유형16좌표")
    private String class16Crdnt;

    @ApiModelProperty(value = "클래스유형17")
    private String class17;

    @ApiModelProperty(value = "클래스유형17좌표")
    private String class17Crdnt;

    @ApiModelProperty(value = "클래스유형18")
    private String class18;

    @ApiModelProperty(value = "클래스유형18좌표")
    private String class18Crdnt;

    @ApiModelProperty(value = "클래스유형19")
    private String class19;

    @ApiModelProperty(value = "클래스유형19좌표")
    private String class19Crdnt;

    @ApiModelProperty(value = "클래스유형20")
    private String class20;

    @ApiModelProperty(value = "클래스유형20좌표")
    private String class20Crdnt;

    @ApiModelProperty(value = "단위데이터셋포함유무")
    private String unitDtstInclYn;

    @ApiModelProperty(value = "단위데이터셋포함일자")
    private String unitDtstInclDttm;

    @ApiModelProperty(value = "단위데이터셋ID")
    private String unitDtstId;

    @ApiModelProperty(value = "검증유무")
    private String dtrmYn;

    @ApiModelProperty(value = "검증일자")
    private String dtrmDttm;

    @ApiModelProperty(value = "라벨json")
    private String labelJson;

}
