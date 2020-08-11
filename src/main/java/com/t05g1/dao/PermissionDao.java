package com.t05g1.dao;

import com.t05g1.pojo.Permission;
import com.t05g1.pojo.PermissionExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PermissionDao {
	
    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
    
    List<Permission> queryAllDataFromTable(@Param("curr") int curr, @Param("limit") int limit);
    
   	int queryAllCount();
}