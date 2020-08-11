package com.t05g1.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.PermissionDao;
import com.t05g1.dao.RolePermissionDao;
import com.t05g1.pojo.Permission;
import com.t05g1.pojo.PermissionExample;
import com.t05g1.pojo.Role;
import com.t05g1.pojo.RolePermission;
import com.t05g1.pojo.RolePermissionExample;
import com.t05g1.service.PermissionService;
import com.t05g1.service.RoleService;

@Service
public class PermissionServiceImpl implements PermissionService{
	
	@Autowired
	private PermissionDao permissionDao;	
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private RolePermissionDao rolePermissionDao;

	@Override
	public Set<String> listPermissions(String userName) {
		// TODO Auto-generated method stub
		Set<String> result = new HashSet<>();
		List<Role> roles = roleService.listRoles(userName);

		List<RolePermission> rolePermissions = new ArrayList<>();

		for (Role role : roles) {
			RolePermissionExample example = new RolePermissionExample();
			example.createCriteria().andRidEqualTo(role.getId());
			List<RolePermission> rps = rolePermissionDao.selectByExample(example);
			rolePermissions.addAll(rps);
		}

		for (RolePermission rolePermission : rolePermissions) {
			Permission p = permissionDao.selectByPrimaryKey(rolePermission.getPid());
			result.add(p.getName());
		}

		return result;
	}

	@Override
	public List<Permission> list() {
		// TODO Auto-generated method stub
		PermissionExample example = new PermissionExample();
		example.setOrderByClause("id desc");
		return permissionDao.selectByExample(example);
	}

	@Override
	public int add(Permission permission) {
		// TODO Auto-generated method stub
		
		return permissionDao.insert(permission) ;
		
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		
		return permissionDao.deleteByPrimaryKey(id);
		
	}

	@Override
	public Permission get(Long id) {
		// TODO Auto-generated method stub
		return permissionDao.selectByPrimaryKey(id);
	}

	@Override
	public int update(Permission permission) {
		// TODO Auto-generated method stub

		return permissionDao.updateByPrimaryKeySelective(permission);
	}

	@Override
	public List<Permission> list(Role role) {
		// TODO Auto-generated method stub
		List<Permission> result = new ArrayList<>();
		RolePermissionExample example = new RolePermissionExample();
		example.createCriteria().andRidEqualTo(role.getId());
		List<RolePermission> rps = rolePermissionDao.selectByExample(example);
		for (RolePermission rolePermission : rps) {
			result.add(permissionDao.selectByPrimaryKey(rolePermission.getPid()));
		}

		return result;
	}

	@Override
	public boolean needInterceptor(String requestURI) {
		// TODO Auto-generated method stub
		List<Permission> ps = list();
		for (Permission p : ps) {			
			if (p.getUrl().equals(requestURI))
				return true;
		}
		return false;
	}

	@Override
	public Set<String> listPermissionURLs(String userName) {
		// TODO Auto-generated method stub
		Set<String> result = new HashSet<>();
		List<Role> roles = roleService.listRoles(userName);

		List<RolePermission> rolePermissions = new ArrayList<>();

		for (Role role : roles) {
			RolePermissionExample example = new RolePermissionExample();
			example.createCriteria().andRidEqualTo(role.getId());
			List<RolePermission> rps = rolePermissionDao.selectByExample(example);
			rolePermissions.addAll(rps);
		}

		for (RolePermission rolePermission : rolePermissions) {
			Permission p = permissionDao.selectByPrimaryKey(rolePermission.getPid());
			result.add(p.getUrl());
		}
		return result;
	}

	@Override
	public List<Permission> queryAllDataFromTable(int curr, int limit) {
		// TODO Auto-generated method stub
		curr=(curr-1)*limit;
		return permissionDao.queryAllDataFromTable(curr, limit);
	}

	@Override
	public int queryAllCount() {
		// TODO Auto-generated method stub
		return permissionDao.queryAllCount();
	}

}
