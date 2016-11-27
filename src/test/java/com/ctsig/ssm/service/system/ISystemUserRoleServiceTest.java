package com.ctsig.ssm.service.system;


import com.alibaba.fastjson.JSON;
import com.ctsig.ssm.entity.system.SystemMenu;
import com.ctsig.ssm.entity.system.SystemRole;
import com.ctsig.ssm.entity.system.SystemRoleMenu;
import com.ctsig.ssm.entity.system.SystemUserRole;
import com.ctsig.ssm.test.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ISystemUserRoleServiceTest extends BaseTest{

	@Autowired
	private ISystemUserRoleService systemUserRoleService;
	
	@Autowired
	private ISystemRoleMenuService systemRoleMenuService;
	
	@Autowired
	private ISystemMenuService systemMenuService;
	
	@Autowired
	private ISystemRoleService systemRoleService;
	
	@Test
	public void testSelectRoleListByAccountId() {
		try {
			List<SystemUserRole> userRoles =systemUserRoleService.selectRoleListByAccountId(9);
			System.out.println(JSON.toJSON(userRoles));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testselectMenuListByRoleId() {
		try {
			List<Integer> roleIdList = new ArrayList<Integer>();
			roleIdList.add(1);
			roleIdList.add(2);
			List<SystemRoleMenu> roleMenus = systemRoleMenuService.selectMenuListByRoleId(roleIdList);
			System.out.println(JSON.toJSON(roleMenus));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testselectSystemMenu(){
		List<SystemMenu> menus = systemMenuService.selectSystemMenu();
		System.out.println(JSON.toJSON(menus));
	}
	
	@Test
	public void testselectRoleAndNumber(){
		List<SystemRole> roles = systemRoleService.selectRoleAndNumber();
		System.out.println(JSON.toJSON(roles));
	}
}
