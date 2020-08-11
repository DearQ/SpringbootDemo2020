package com.t05g1.dao;

import com.t05g1.pojo.Admin_Users;
import com.t05g1.pojo.Admin_UsersExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface Admin_UsersDao {
	
    int deleteByPrimaryKey(Integer u_id);

    int insert(Admin_Users record);

    int insertSelective(Admin_Users record);

    List<Admin_Users> selectByExample(Admin_UsersExample example);

    Admin_Users selectByPrimaryKey(Integer u_id);

    int updateByPrimaryKeySelective(Admin_Users record);

    int updateByPrimaryKey(Admin_Users record);
    /***
     * 用户管理
     * @param curr
     * @param limit
     * @param u_name
     * @param u_type
     * @return
     */
    List<Admin_Users> queryAllDataFromByUsersTable(@Param("curr") int curr, @Param("limit") int limit,	@RequestParam("u_name")String u_name,@RequestParam("u_type") int u_type);
	 /***
	  * 统计管理员数量
	  * @param u_name
	  * @param u_type
	  * @return
	  */
	int queryAllByUsersCount(@RequestParam("u_name")  String u_name,@RequestParam("u_type")int u_type);
	 /**
	  * 统计用户		 
	  * @return
	  */
	 int selectId();
	 /**
	  * 改变用户状态
	  * @param u_id
	  * @param u_type
	  * @return
	  */
	 int UserBlockOrStart(int u_id,int u_type);
	 
		
}