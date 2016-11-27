package com.ctsig.ssm.service.impl.system;

import java.util.List;

import com.ctsig.ssm.dao.system.SystemUserLoginLogMapper;
import com.ctsig.ssm.service.system.ISystemUserLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.framework.service.impl.SuperServiceImpl;
import com.ctsig.ssm.entity.system.SystemUserLoginLog;

/**
 * 
* 项目名称：morning Maven Webapp   
* 类名称：SystemUserLoginLogServiceImpl   
* 类描述：SystemUserLoginLog 表业务逻辑层接口实现类   
* 创建人：陈星星   
* 创建时间：2016年11月12日 下午11:40:57   
* 修改人：陈星星   
* 修改时间：2016年11月12日 下午11:40:57   
* @version
 */
@Service
public class SystemUserLoginLogServiceImpl extends SuperServiceImpl<SystemUserLoginLogMapper, SystemUserLoginLog> implements ISystemUserLoginLogService {
	
	@Autowired
	private SystemUserLoginLogMapper systemUserLoginLogMapper;
	
	@Override
	public List<SystemUserLoginLog> selectUserLoginLog(Integer userId) {
		return systemUserLoginLogMapper.selectUserLoginLog(userId);
	}


}