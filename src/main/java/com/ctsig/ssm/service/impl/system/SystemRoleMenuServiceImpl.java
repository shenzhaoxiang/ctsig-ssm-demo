package com.ctsig.ssm.service.impl.system;

import java.util.List;

import com.ctsig.ssm.dao.system.SystemRoleMenuMapper;
import com.ctsig.ssm.entity.system.SystemRoleMenu;
import com.ctsig.ssm.service.system.ISystemRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 * 
* 项目名称：morning Maven Webapp   
* 类名称：SystemRoleMenuServiceImpl   
* 类描述：SystemRoleMenu 表业务逻辑层接口实现类   
* 创建人：陈星星   
* 创建时间：2016年11月13日 下午10:43:04   
* 修改人：陈星星   
* 修改时间：2016年11月13日 下午10:43:04   
* @version
 */
@Service
public class SystemRoleMenuServiceImpl extends SuperServiceImpl<SystemRoleMenuMapper, SystemRoleMenu> implements ISystemRoleMenuService {
	
	@Autowired
	private SystemRoleMenuMapper systemRoleMenuMapper;
	
	@Override
	public List<SystemRoleMenu> selectMenuListByRoleId(List<Integer> roleIdList) {
		System.out.println(JSON.toJSON(roleIdList));
		return systemRoleMenuMapper.selectMenuListByRoleId(roleIdList);
	}


}