package com.zhubao.docker.datasource;

import java.text.MessageFormat;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(-10)
@Component
public class DynamicDataSourceAspect {

	private Logger log = Logger.getLogger(DynamicDataSourceAspect.class);
	@Before("@annotation(targetDataSource)")
	public void changeDataSource(JoinPoint point, TargetDataSource targetDataSource) throws Throwable {
		String dsId = targetDataSource.value();
		if (!DynamicDataSourceContextHolder.containsDataSource(dsId)) {
			log.info(MessageFormat.format("Datasource [{0}] is not exist, use the default > {1}" , targetDataSource.value() , point.getSignature()));
		} else {
			log.info(MessageFormat.format("Use DataSource : {0} > {1}", targetDataSource.value() , point.getSignature()));
			DynamicDataSourceContextHolder.setDataSourceType(targetDataSource.value());
		}
	}

	@After("@annotation(targetDataSource)")
	public void restoreDataSource(JoinPoint point, TargetDataSource targetDataSource) {
		log.info(MessageFormat.format("Revert DataSource : {0} > {1}", targetDataSource.value(), point.getSignature()));
		DynamicDataSourceContextHolder.clearDataSourceType();
	}
}
