package com.ctsig.ssm.service.system;

import com.alibaba.fastjson.JSON;
import com.ctsig.ssm.entity.system.SystemUser;
import com.ctsig.ssm.entity.system.SystemUserLoginLog;
import com.ctsig.ssm.entity.user.QueryUser;
import com.ctsig.ssm.test.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ISystemUserServiceTest extends BaseTest{
	
	@Autowired
	private ISystemUserService iSystemUserService;
	@Autowired
	private ISystemUserLoginLogService systemUserLoginLogService;
	
	@Test
	public void testSelectByLoginName() {
		SystemUser user  =iSystemUserService.selectByLoginName("admin");
		System.out.println(JSON.toJSON(user));
	}

	@Test
	public void testSelectAllSystemUserNumber() {
		int number = iSystemUserService.selectAllSystemUserNumber();
		System.out.println(number);
	}

	@Test
	public void testSelectAllSystemUser() {
		QueryUser queryUser = new QueryUser();
		queryUser.setSearchContent("87879");
		List<SystemUser> systemUsers = iSystemUserService.selectAllSystemUser(queryUser);
		System.out.println(JSON.toJSON(systemUsers));
	}

	@Test
	public void testUpdateLogByLoginName() {
		iSystemUserService.updateLogByLoginName(1, "136.445.157.1", "360安全","windows");
	}
	
	@Test
	public void testupdateUserStatus(){
		try {
			SystemUser systemUser = new SystemUser();
			systemUser.setAccountId(15);
			systemUser.setUserName("你好");
			iSystemUserService.updateUserInfo(systemUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testdeleteSysUser(){
		iSystemUserService.deleteSysUser(9);
	}
	
	@Test
	public void testSelectUserLoginLog(){
		List<SystemUserLoginLog> loginLogs = systemUserLoginLogService.selectUserLoginLog(2);
		System.out.println(JSON.toJSON(loginLogs));
	}
	
	@Test
	public void testselectSysUserByRoleId(){
		List<SystemUser> systemUsers = iSystemUserService.selectSysUserByRoleId(1);
		System.out.println(JSON.toJSON(systemUsers));
	}
}
