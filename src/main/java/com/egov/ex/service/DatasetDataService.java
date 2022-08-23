package com.egov.ex.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.mapper.DatasetDataMapper;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

/**
 * <p>
 * 상환판 집계 服务实现类
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class DatasetDataService extends EgovAbstractServiceImpl {
    @Resource
    private DatasetDataMapper datasetMapper;

	public List<HashMap> getLabelDataCnt() {
		// TODO Auto-generated method stub
		return datasetMapper.getLabelDataCnt();
	}

	public List<HashMap> getDatasetDataCnt() {
		// TODO Auto-generated method stub
		return datasetMapper.getDatasetDataCnt();
	}

    
}
