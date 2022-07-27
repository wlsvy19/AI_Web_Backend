package com.egov.ex.service;

import com.egov.ex.dto.ServerStatusDto;
import com.egov.ex.entity.ServerStatus;
import com.egov.ex.mapper.ServerStatusMapper;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 서버 상태 모니터링 서비스
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Service
public class ServerStatusService extends EgovAbstractServiceImpl {
    @Resource
    private ServerStatusMapper serverStatusMapper;

    public ServerStatus selectServerStatusInfo(ServerStatusDto param) {
        return serverStatusMapper.selectServerStatusInfo(param);
    }
}
