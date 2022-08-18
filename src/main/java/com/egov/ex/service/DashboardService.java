package com.egov.ex.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.ex.entity.Dashboard;
import com.egov.ex.mapper.DashboardMapper;

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
public class DashboardService extends EgovAbstractServiceImpl {
    @Resource
    private DashboardMapper dashboardMapper;

    public Dashboard selectDashboardByTerm() {
       return dashboardMapper.selectDashboardByTerm();
    }
    
    public List<HashMap> selectNmrecg() {
        return dashboardMapper.selectNmrecg();
     }
}
