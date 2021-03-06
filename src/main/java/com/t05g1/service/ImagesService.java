package com.t05g1.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.t05g1.pojo.Images;
import com.t05g1.pojo.ImagesExample;

public interface ImagesService {
	
	    int deleteByPrimaryKey(Integer id);

	    int insert(Images record);

	    int insertSelective(Images record);

	    List<Images> selectByExample(ImagesExample example);
	    
	    Integer insertByAll(Integer colourId,Integer commId,String uriDa,String uriZ,String uriX);
	    
	    List<Images> selectById( int curr,int limit,int commId);
	    
	    int queryAllCount(int commId);

	    Images selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(Images record);

	    int updateByPrimaryKey(Images record);

}
