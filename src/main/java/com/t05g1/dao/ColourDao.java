package com.t05g1.dao;

import com.t05g1.pojo.Colour;
import java.util.List;

public interface ColourDao {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Colour record);

    int insertSelective(Colour record);

    List<Colour> selectByExample();
    
    List<Colour> selectByExampleByid(Integer id);

    Colour selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Colour record);

    int updateByPrimaryKey(Colour record);
    
    List<Colour> selectColorById(Integer commoId);
}