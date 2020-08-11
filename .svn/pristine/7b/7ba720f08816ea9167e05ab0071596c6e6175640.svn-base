package com.t05g1.dao;

import com.t05g1.pojo.Role;
import com.t05g1.pojo.RoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RoleDao {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    List<Role> queryAllDataFromTable(@Param("curr") int curr, @Param("limit") int limit);
  
   	int queryAllCount();
}