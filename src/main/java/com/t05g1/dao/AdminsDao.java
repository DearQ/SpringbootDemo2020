package com.t05g1.dao;

import com.t05g1.pojo.Admins;
import com.t05g1.pojo.AdminsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface AdminsDao {
	 /***
	  * 查询管理员
	  * @param curr
	  * @param limit
	  * @param admins
	  * @return
	  */
	 List<Admins> queryAllDataFromTable(@Param("curr") int curr, @Param("limit") int limit,	@RequestParam("a_adminName") String a_adminName,@RequestParam("a_id") int a_id);
	/***
	 * 统计管理员数量
	 * @param admin
	 * @return
	 */
	int queryAllCount(@RequestParam("a_adminName") String a_adminName,@RequestParam("a_id") int a_id);
	/**
	 * 登录
	 * @param name
	 * @param passwords
	 * @return
	 */
    Admins adminLogin(@Param("name")String name,@Param("password")String passwords);
    /***
     * 
     * @param id
     * @return
     */
    Admins FindUserByUserId(@Param("id")Long id);
    /***
     * 
     * @param admins
     * @return
     */
    int Update(Admins admins);
    /***
     * 是否启用管理员
     * @param a_id
     * @param a_holder
     * @return
     */
    int isState(Integer a_id,String a_holder);
    
    int deleteByPrimaryKey(Integer id);

    int insert(Admins record);

    int insertSelective(Admins record);

    List<Admins> selectByExample(AdminsExample example);

    Admins selectByPrimaryKey(Integer a_id);

    int updateByPrimaryKeySelective(Admins record);

    int updateByPrimaryKey(Admins record);
}