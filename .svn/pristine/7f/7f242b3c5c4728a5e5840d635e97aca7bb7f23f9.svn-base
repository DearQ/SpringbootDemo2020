package com.t05g1.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.RoleDao;
import com.t05g1.dao.UserRoleDao;
import com.t05g1.pojo.Admins;
import com.t05g1.pojo.Role;
import com.t05g1.pojo.RoleExample;
import com.t05g1.pojo.UserRole;
import com.t05g1.pojo.UserRoleExample;
import com.t05g1.service.AdminService;
import com.t05g1.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleDao roleDao;
	@Autowired
	UserRoleDao userRoleDao;
	@Autowired
	AdminService adminService;

	@Override
	public Set<String> listRoleNames(String userName) {
		Set<String> result = new HashSet<>();
		List<Role> roles = listRoles(userName);
		for (Role role : roles) {
			result.add(role.getName());
		}
		return result;
	}

	@Override
	public List<Role> listRoles(String userName) {
		List<Role> roles = new ArrayList<>();
		Admins admin = adminService.getByName(userName);
		if (null == admin)
			return roles;

		roles = listRoles(admin);
		return roles;
	}

	@Override
	public int add(Role u) {
		
		return roleDao.insert(u);
	}

	@Override
	public int delete(Long id) {
		
		return roleDao.deleteByPrimaryKey(id);
	}

	@Override
	public int update(Role u) {
		
		return roleDao.updateByPrimaryKeySelective(u);
	}

	@Override
	public Role get(Long id) {
		return roleDao.selectByPrimaryKey(id);
	}

	@Override
	public List<Role> list() {
		RoleExample example = new RoleExample();
		example.setOrderByClause("id desc");
		return roleDao.selectByExample(example);

	}

	@Override
	public List<Role> listRoles(Admins admin) {
		List<Role> roles = new ArrayList<>();

		UserRoleExample example = new UserRoleExample();

		example.createCriteria().andAidEqualTo(admin.getA_id());
		List<UserRole> userRoles = userRoleDao.selectByExample(example);

		for (UserRole userRole : userRoles) {
			Role role = roleDao.selectByPrimaryKey(userRole.getRid());
			roles.add(role);
		}
		return roles;
	}

	@Override
	public List<Role> queryAllDataFromTable(int curr, int limit) {
		// TODO Auto-generated method stub
		curr=(curr-1)*limit;
		return roleDao.queryAllDataFromTable(curr, limit);
	}

	@Override
	public int queryAllCount() {
		// TODO Auto-generated method stub
		return roleDao.queryAllCount();
	}

}
