package com.egov.ex.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.dto.ExlprServerInfoSearchDto;
import com.egov.ex.dto.UnitDtstSearchDto;
import com.egov.ex.entity.ExlprServerInfo;
import com.egov.ex.entity.UnitDtst;
import com.egov.ex.mapper.UnitDtstMapper;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * <p>
 * 단위 데이터셋 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class UnitDtstService extends EgovAbstractServiceImpl {
    @Resource
    private UnitDtstMapper unitDtstMapper;

    public List<UnitDtst> selectUnitDtstList(UnitDtstSearchDto param) {
        return unitDtstMapper.selectUnitDtstList(param);
    }

    public List<ExlprServerInfo> updtList(ExlprServerInfoSearchDto param) {
        return unitDtstMapper.updtList(param);
    }

	public List<UnitDtst> selectUnitDtstListById(UnitDtstSearchDto param) {
		return unitDtstMapper.selectUnitDtstListById(param);
	}
	
	public List<HashMap> hdqrList() {
		return unitDtstMapper.hdqrList();
	}
}
