package com.egov.ex.mapper;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.egov.ex.dto.RpcsValidationStatusInfoDto;
import com.egov.ex.dto.TolofInfoDto;
import com.egov.ex.entity.RpcsValidationStatusInfo;
import com.egov.ex.entity.TolofInfo;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

/**
 * <p>
 * 학습 상태 모니터링 Mapper
 * </p>
 *
 * @author  
 * @since 2022-06-01
 */
@Mapper
@Repository
public interface RpcsValidationStatusMapper {

	RpcsValidationStatusInfo selectRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param);   
	
	int updateStartRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param);
	
    int updateStopRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param);
    
    int updateCompleteRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param);
    
    int updateStepRpcsValidationStatusInfo(RpcsValidationStatusInfoDto param);
    
    List<TolofInfo> selectHdqrNmList();
    
    List<TolofInfo> selectMtnofNmListByHdqrCd(TolofInfoDto param);
    
    List<TolofInfo> selectTolofNmListByCd(TolofInfoDto param);
    
    List<TolofInfo> selectCrgwInfoListByCd(TolofInfoDto param);
    
}
