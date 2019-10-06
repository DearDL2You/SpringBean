package com.dinglei.SpringBean.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
public class BeanAppContextAware implements ApplicationContextAware{

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanAppContextAware : " + applicationContext.getBean("beanAppContextAware").hashCode());
	}

}
