package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.User_BrandDao;
import com.t05g1.pojo.User_Brand;
import com.t05g1.service.User_BrandService;

@Service
public class User_BrandSserviceImpl implements User_BrandService {
	
	@Autowired
	private User_BrandDao ubreDao;
	@Override
	public List<User_Brand> showBrand() {
		// TODO Auto-generated method stub
		return ubreDao.showBrand();
	}

}
