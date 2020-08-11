package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.User_ColourDao;
import com.t05g1.pojo.User_Colour;
import com.t05g1.service.User_ColourService;

@Service
public class User_ColourServiceImpl implements User_ColourService {

	@Autowired
	private User_ColourDao colourDao;
	@Override
	public List<User_Colour> showColourBycommId(Integer cId) {
		// TODO Auto-generated method stub
		return colourDao.showColourBycommId(cId);
	}

}
