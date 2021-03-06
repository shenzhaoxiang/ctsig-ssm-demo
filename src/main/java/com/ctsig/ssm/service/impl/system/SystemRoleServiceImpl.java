package com.ctsig.ssm.service.impl.system;

import java.util.List;

import com.ctsig.ssm.dao.system.SystemRoleMapper;
import com.ctsig.ssm.dao.system.SystemUserRoleMapper;
import com.ctsig.ssm.entity.system.SystemRole;
import com.ctsig.ssm.entity.system.SystemUserRole;
import com.ctsig.ssm.service.system.ISystemRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 * 
* 项目名称：morning Maven Webapp   
* 类名称：SystemRoleServiceImpl   
* 类描述：SystemRole 表业务逻辑层接口实现类   
* 创建人：陈星星   
* 创建时间：2016年11月13日 下午9:53:15   
* 修改人：陈星星   
* 修改时间：2016年11月13日 下午9:53:15   
* @version
 */
@Service
public class SystemRoleServiceImpl extends SuperServiceImpl<SystemRoleMapper, SystemRole> implements ISystemRoleService {

	@Autowired
	private SystemRoleMapper systemRoleMapper;
	@Autowired
	private SystemUserRoleMapper systemUserRoleMapper;
	
	@Override
	public List<SystemRole> selectRoleList() {
		return systemRoleMapper.selectAllRole();
	}
	
	@Override
	public List<SystemRole> selectRoleAndNumber() {
		List<SystemRole> systemRoles = systemRoleMapper.selectAllRole();
		SystemUserRole systemUserRole = new SystemUserRole();
		for(int i = 0;i<systemRoles.size();i++){
			systemUserRole.setRoleId(systemRoles.get(i).getRoleId());
			int number = systemUserRoleMapper.selectCount(systemUserRole);
			systemRoles.get(i).setNumber(number);
		}
		return systemRoles;
	}

}