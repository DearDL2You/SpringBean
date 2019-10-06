package com.dinglei.SpringBeanAspject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dinglei.SpringBean.Bean.BeanScope;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:beanScope.xml"})  
public class BeanAspjectTest {

//	@Autowired
//	private BeanScope beanScope;
	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void sayBeanScopeTest() {
		applicationContext.getBean("beanScope");
		System.out.println("sayBeanScopeTest..1..");

	}
	@Test
	public void sayBeanScopeTest2() {
//		beanScope.sayBeanScope();
		System.out.println("sayBeanScopeTest..12..");

	}
}
