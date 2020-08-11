package com.t05g1.dao;

import com.t05g1.pojo.RolePermission;
import com.t05g1.pojo.RolePermissionExample;
import java.util.List;

public interface RolePermissionDao {
	
    int deleteByPrimaryKey(Long id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    List<RolePermission> selectByExample(RolePermissionExample example);

    RolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}