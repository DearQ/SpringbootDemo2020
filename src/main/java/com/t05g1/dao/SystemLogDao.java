package com.t05g1.dao;

import com.t05g1.pojo.SystemLog;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Unclue_liu
 * @organization tyzn
 * @date 2019/8/31 0031 10:09
 * @desc TODO
 */
@Mapper
public interface SystemLogDao {
	
    int addLog(SystemLog log);
    
    int deleteLog();

    int insert(SystemLog record);

    int insertSelective(SystemLog record);
    
    List<SystemLog> queryAllDataFromTable(@Param("curr") int curr, @Param("limit") int limit);
 
   	int queryAllCount();
   
}
