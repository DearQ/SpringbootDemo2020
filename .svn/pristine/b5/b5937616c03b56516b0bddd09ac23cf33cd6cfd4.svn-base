package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.Admin_UsersDao;
import com.t05g1.dao.AdminsDao;
import com.t05g1.pojo.Admin_Users;
import com.t05g1.pojo.Admins;
import com.t05g1.pojo.AdminsExample;
import com.t05g1.service.AdminService;
import com.t05g1.service.UserRoleService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminsDao adminDao;
	
	@Autowired
	private UserRoleService userRoleService;
	
	@Autowired
	private Admin_UsersDao admin_UsersDao;

	@Override
	public String getPassword(String name) {
		Admins admin = getByName(name);
		if (null == admin)
			return null;
		return admin.getA_adminName();
	}

	@Override
	public Admins getByName(String name) {
		AdminsExample example = new AdminsExample();
		example.createCriteria().andA_adminNameEqualTo(name);
		List<Admins> adminList = adminDao.selectByExample(example);
		
		if (adminList.isEmpty())
			return null;
		return adminList.get(0);
	}

	@Override
	public int add(Admins a) {
		
		return adminDao.insert(a);
	}

	@Override
	public int delete(Integer id) {
		
		adminDao.deleteByPrimaryKey(id);
		userRoleService.deleteByUser(id);
		
		return 1;
	}

	@Override
	public int update(Admins a) {
		return adminDao.updateByPrimaryKeySelective(a);
	}

	@Override
	public Admins get(Integer id) {
		return adminDao.selectByPrimaryKey(id);
	}

	@Override
	public List<Admins> list() {
		AdminsExample example = new AdminsExample();
		example.setOrderByClause("id desc");
		return adminDao.selectByExample(example);

	}
	//登录
	@Override
	public Admins adminLogin(String name, String passwords) {
		
		return adminDao.adminLogin(name, passwords);
	}

	@Override
	public Admins FindUserByUserId(Long id) {
		// TODO Auto-generated method stub
		return adminDao.FindUserByUserId(id);
	}

	@Override
	public int Update(Admins admins) {
		// TODO Auto-generated method stub
		return adminDao.Update(admins);
	}

	@Override
	public List<Admins> queryAllDataFromTable(int curr, int limit,String a_adminName,int a_id) {
		// TODO Auto-generated method stub
		curr=(curr-1)*limit;
		return adminDao.queryAllDataFromTable(curr, limit,a_adminName,a_id);
	}

	@Override
	public int queryAllCount(String a_adminName,int a_id) {
		// TODO Auto-generated method stub
		return adminDao.queryAllCount(a_adminName,a_id);
	}

	@Override
	public int isState(Integer a_id, String a_holder) {
		// TODO Auto-generated method stub
		return adminDao.isState(a_id, a_holder);
	}

	@Override
	public List<Admin_Users> queryAllDataFromByUsersTable(int curr, int limit, String u_name, int u_type) {
		// TODO Auto-generated method stub
		curr=(curr-1)*limit;
		return admin_UsersDao.queryAllDataFromByUsersTable(curr, limit, u_name, u_type);
	}

	@Override
	public int queryAllByUsersCount(String u_name, int u_type) {
		// TODO Auto-generated method stub
		return admin_UsersDao.queryAllByUsersCount(u_name, u_type);
	}

	@Override
	public int delUsers(Integer u_id) {
		// TODO Auto-generated method stub
		return admin_UsersDao.deleteByPrimaryKey(u_id);
	}

	@Override
	public int updateUsers(Admin_Users record) {
		// TODO Auto-generated method stub
		return admin_UsersDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int insertSelective(Admin_Users record) {
		// TODO Auto-generated method stub
		return admin_UsersDao.insert(record);
	}

	@Override
	public int selectId() {
		// TODO Auto-generated method stub
		return admin_UsersDao.selectId();
	}

	@Override
	public int UserBlockOrStart(int u_id, int u_type) {
		// TODO Auto-generated method stub
		return admin_UsersDao.UserBlockOrStart(u_id, u_type);
	}

	

}
