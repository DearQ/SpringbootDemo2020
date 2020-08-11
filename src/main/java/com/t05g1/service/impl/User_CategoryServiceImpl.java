package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.User_CategoryDao;
import com.t05g1.pojo.User_Category;
import com.t05g1.service.User_CategoryService;

@Service
public class User_CategoryServiceImpl implements User_CategoryService {
	
	@Autowired
	private User_CategoryDao ucatDao;
	
	@Override
	public List<User_Category> showCategory() {
		// TODO Auto-generated method stub
		return ucatDao.showCategory();
	}

}
