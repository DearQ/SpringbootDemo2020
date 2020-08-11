package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.UserRoleDao;
import com.t05g1.pojo.Admins;
import com.t05g1.pojo.UserRole;
import com.t05g1.pojo.UserRoleExample;
import com.t05g1.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	UserRoleDao userRoleDao;

	@Override
	public int setRoles(Admins admin, long[] roleIds) {
		// 删除当前用户所有的角色
		UserRoleExample example = new UserRoleExample();
		example.createCriteria().andAidEqualTo(admin.getA_id());
		List<UserRole> urs = userRoleDao.selectByExample(example);
		for (UserRole userRole : urs) {		
			userRoleDao.deleteByPrimaryKey(userRole.getId());
		}
		// 设置新的角色关系
		if (null != roleIds)
			for (long rid : roleIds) {
				UserRole userRole = new UserRole();
				userRole.setRid(rid);
				userRole.setAid(admin.getA_id());
				userRoleDao.insert(userRole);
			}
		return 1;
		
	}

	@Override
	public void deleteByUser(Integer aId) {
		UserRoleExample example = new UserRoleExample();
		example.createCriteria().andAidEqualTo(aId);
		List<UserRole> urs = userRoleDao.selectByExample(example);
		for (UserRole userRole : urs) {
			userRoleDao.deleteByPrimaryKey(userRole.getId());
		}
	}

	@Override
	public void deleteByRole(long roleId) {
		UserRoleExample example = new UserRoleExample();
		example.createCriteria().andRidEqualTo(roleId);
		List<UserRole> urs = userRoleDao.selectByExample(example);
		for (UserRole userRole : urs) {
			userRoleDao.deleteByPrimaryKey(userRole.getId());
		}
	}

}