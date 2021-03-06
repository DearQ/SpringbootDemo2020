package com.t05g1.config;

import org.quartz.CronTrigger;
import org.quartz.JobDataMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.t05g1.job.UserJon;


@Configuration
public class QuartzConfig {
	
	@Bean
	JobDetailFactoryBean findUserJobDetail() {
		JobDetailFactoryBean bean = new JobDetailFactoryBean();
		bean.setJobClass(UserJon.class);
		JobDataMap jobDataMap = new JobDataMap();
		//jobDataMap.put("name", "zs");  //要传递的参数
		bean.setJobDataAsMap(jobDataMap);
		bean.setDurability(true);
		return bean;
	}
	
	@Bean
	CronTriggerFactoryBean findUserTrigger() {
		CronTriggerFactoryBean bean = new CronTriggerFactoryBean();
		bean.setJobDetail(findUserJobDetail().getObject());
		bean.setCronExpression("0 25 02 * * ? 2020");// 定时器要执行的时间:2020年不考虑星期几不考虑月份号数30点分整开始执行
		return bean;
	}
	
	SchedulerFactoryBean schedulerFactory() {
		SchedulerFactoryBean bean = new SchedulerFactoryBean();
		CronTrigger trigger = findUserTrigger().getObject();
		bean.setTriggers(trigger);
		return bean;
	}
	
}
