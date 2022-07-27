package com.egov.ex.mapper;
import com.egov.ex.dto.ServerStatusDto;
import com.egov.ex.entity.ServerStatus;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.springframework.stereotype.Repository;


/**
 * <p>
 * 서버 상태 모니터링 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface ServerStatusMapper {

    ServerStatus selectServerStatusInfo(ServerStatusDto param);
}
