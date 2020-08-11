package com.t05g1.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import com.t05g1.service.ISystemLogService;

@Component
public class UserJon extends QuartzJobBean {
	
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Autowired
	private ISystemLogService isystemLogService ;

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		
		isystemLogService.deleteLog();

	}

}
