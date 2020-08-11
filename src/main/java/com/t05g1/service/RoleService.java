package com.t05g1.service;

import java.util.List;
import java.util.Set;

import com.t05g1.pojo.Admins;
import com.t05g1.pojo.Role;


public interface RoleService {
	
	public Set<String> listRoleNames(String userName);

	public List<Role> listRoles(String userName);

	public List<Role> listRoles(Admins admins);

	public List<Role> list();

	public int add(Role role);

	public int delete(Long id);

	public Role get(Long id);

	public int update(Role role);
		  
    List<Role> queryAllDataFromTable(int curr,int limit);
  
   	int queryAllCount();

}
