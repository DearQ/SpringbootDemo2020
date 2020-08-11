package com.t05g1.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.t05g1.dao.SystemLogDao;
import com.t05g1.pojo.SystemLog;
import com.t05g1.service.ISystemLogService;

import java.util.List;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author uncle
 * @since 2019-08-30
 */
@Service
@Transactional
public class SystemLogServiceImpl implements ISystemLogService {

    @Resource
    private SystemLogDao logdao;

    @Override
    public int addLog(SystemLog log) {
        return logdao.addLog(log);
    }

	@Override
	public int insertSelective(SystemLog record) {
		// TODO Auto-generated method stub
		return logdao.insertSelective(record);
	}

	@Override
	public List<SystemLog> queryAllDataFromTable(int curr, int limit) {
		// TODO Auto-generated method stub
		curr=(curr-1)*limit;
		return logdao.queryAllDataFromTable(curr, limit);
	}

	@Override
	public int queryAllCount() {
		// TODO Auto-generated method stub
		return logdao.queryAllCount();
	}

	@Override
	public int deleteLog() {
		// TODO Auto-generated method stub
		System.out.println("删除咯！");
		return logdao.deleteLog();
	}
}
