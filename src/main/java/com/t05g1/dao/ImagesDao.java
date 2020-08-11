package com.t05g1.dao;

import com.t05g1.pojo.Images;
import com.t05g1.pojo.ImagesExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ImagesDao {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Images record);

    int insertSelective(Images record);
    
    int insertByAll(@Param("colourId")int colourId,@Param("commId")int commId,@Param("uriDa")String uriDa,@Param("uriZ")String uriZ,@Param("uriX")String uriX);

    List<Images> selectByExample(ImagesExample example);
    
    List<Images> selectById(@Param("curr") int curr, @Param("limit") int limit, @Param("commId") int commId);
    
    int queryAllCount(@Param("commId")int commId);

    Images selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Images record);

    int updateByPrimaryKey(Images record);
}