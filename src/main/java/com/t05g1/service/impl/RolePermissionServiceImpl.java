package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.RolePermissionDao;
import com.t05g1.pojo.Role;
import com.t05g1.pojo.RolePermission;
import com.t05g1.pojo.RolePermissionExample;
import com.t05g1.service.RolePermissionService;


@Service
public class RolePermissionServiceImpl implements RolePermissionService {

	@Autowired
	RolePermissionDao rolePermissionDao;

	@Override
	public void setPermissions(Role role, long[] permissionIds) {
		// 删除当前角色所有的权限
		RolePermissionExample example = new RolePermissionExample();
		example.createCriteria().andRidEqualTo(role.getId());
		List<RolePermission> rps = rolePermissionDao.selectByExample(example);
		for (RolePermission rolePermission : rps)
			rolePermissionDao.deleteByPrimaryKey(rolePermission.getId());

		// 设置新的权限关系
		if (null != permissionIds)
			for (long pid : permissionIds) {
				RolePermission rolePermission = new RolePermission();
				rolePermission.setPid(pid);
				rolePermission.setRid(role.getId());
				rolePermissionDao.insert(rolePermission);
			}
	}

	@Override
	public void deleteByRole(long roleId) {
		RolePermissionExample example = new RolePermissionExample();
		example.createCriteria().andRidEqualTo(roleId);
		List<RolePermission> rps = rolePermissionDao.selectByExample(example);
		for (RolePermission rolePermission : rps)
			rolePermissionDao.deleteByPrimaryKey(rolePermission.getId());
	}

	@Override
	public void deleteByPermission(long permissionId) {
		RolePermissionExample example = new RolePermissionExample();
		example.createCriteria().andPidEqualTo(permissionId);
		List<RolePermission> rps = rolePermissionDao.selectByExample(example);
		for (RolePermission rolePermission : rps)
			rolePermissionDao.deleteByPrimaryKey(rolePermission.getId());
	}

}