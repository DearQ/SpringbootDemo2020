package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.User_CommtypepricrDao;
import com.t05g1.pojo.User_Commtypepricr;
import com.t05g1.service.User_CommtypepricrService;

@Service
public class User_CommtypepricrServiceImpl implements User_CommtypepricrService {

	@Autowired
	private User_CommtypepricrDao commtypepricrDao;
	@Override
	public List<User_Commtypepricr> showCommtypepricrCommId(Integer cId) {
		// TODO Auto-generated method stub
		return commtypepricrDao.showCommtypepricrCommId(cId);
	}
	//版本id查询价格
	@Override
	public User_Commtypepricr CommtypepricrByprive(Integer typeId) {
		// TODO Auto-generated method stub
		return commtypepricrDao.CommtypepricrByprive(typeId);
	}
	
}
