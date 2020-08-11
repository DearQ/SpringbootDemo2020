package com.t05g1.service;


import java.util.List;

import com.t05g1.pojo.Admin_Users;
import com.t05g1.pojo.Admins;
/***
 * 
 * @author qzs
 *
 */
public interface AdminService {
	 
	     String getPassword(String name);

	     Admins getByName(String name);
	 
	     List<Admins> list();

	     int add(Admins admins);

	     int delete(Integer id);

	     Admins get(Integer id);

	     int update(Admins admins);
	     /***
		  * 查询管理员
		  * @param curr
		  * @param limit
		  * @param admins
		  * @return
		  */
		 List<Admins> queryAllDataFromTable(int curr,  int limit,String a_adminName,int a_id);
	     /***
		 * 统计管理员数量
		 * @param admin
		 * @return
		 */
		int queryAllCount(String a_adminName,int a_id);
	     /**
		 * 登录
		 * @param name
		 * @param passwords
		 * @return
		 */
		 Admins adminLogin(String name,String passwords);
		 
		 /**
		  * 获取管理员信息
		  * @param id
		  * @return
		  */
		 Admins FindUserByUserId(Long id);
	    /***
	     * 修改管理员信息
	     * @param admins
	     * @return
	     */
		 int Update(Admins admins);
		 /***
		  * 是否启用管理员
		  * @param c_id
		  * @param c_state
		  * @return
		  */
		 int isState(Integer a_id,String a_holder);
		 /***
		  * 管理用户列表
		  * @param curr
		  * @param limit
		  * @param u_name
		  * @param u_id
		  * @return
		  */
		 List<Admin_Users> queryAllDataFromByUsersTable(int curr,  int limit,String u_name,int u_type);
		 /***
		 * 统计管理员数量
		 * @param admin
		 * @return
		 */
		int queryAllByUsersCount(String u_name,int u_type);
		/***
		 * 删除用户
		 * @param u_id
		 * @return
		 */
		int delUsers(Integer u_id);
		/**
		 * 编辑用户
		 * @param record
		 * @return
		 */
		int updateUsers(Admin_Users record);
		/**
		 * 添加用户
		 * @param record
		 * @return
		 */
		 int insertSelective(Admin_Users record);
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
