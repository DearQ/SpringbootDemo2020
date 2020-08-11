package com.t05g1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.t05g1.dao.User_ImagesDao;
import com.t05g1.pojo.User_Images;
import com.t05g1.service.User_ImagesService;

@Service
public class User_ImagesServiceImpl implements User_ImagesService {

	@Autowired
	private User_ImagesDao imagesDao;
	@Override
	public List<User_Images> showImagesBycommId(Integer cId) {
		// TODO Auto-generated method stub
		return imagesDao.showImagesBycommId(cId);
	}
	//按颜色查询图片
	@Override
	public List<User_Images> showImagesByUri(Integer imgId) {
		// TODO Auto-generated method stub
		return imagesDao.showImagesByUri(imgId);
	}

}
