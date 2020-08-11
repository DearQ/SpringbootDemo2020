package com.t05g1.service;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.t05g1.pojo.Permission;
import com.t05g1.pojo.Role;


public interface PermissionService {
	
	public Set<String> listPermissions(String userName);

	public List<Permission> list();

	public int add(Permission permission);

	public int delete(Long id);

	public Permission get(Long id);

	public int update(Permission permission);

	public List<Permission> list(Role role);

	public boolean needInterceptor(String requestURI);

	public Set<String> listPermissionURLs(String userName);
	
	public List<Permission> queryAllDataFromTable(@Param("curr") int curr, @Param("limit") int limit);
	  
	public int queryAllCount();

}
