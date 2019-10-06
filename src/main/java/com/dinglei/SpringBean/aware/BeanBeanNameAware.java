package com.dinglei.SpringBean.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class BeanBeanNameAware implements BeanNameAware,ApplicationContextAware{

	private String beanName;
	
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName = name;
		System.out.println("BeanBeanNameAware : "+ name) ;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext : "+ applicationContext.getBean(beanName).hashCode()) ;

	}

}
