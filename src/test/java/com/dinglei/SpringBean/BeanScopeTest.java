package com.dinglei.SpringBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dinglei.SpringBean.Bean.BeanScope;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:beanScope.xml"})  
public class BeanScopeTest {

	@Autowired
	private BeanScope beanScope;
	
	
	@Test
	public void sayBeanScopeTest() {
		beanScope.sayBeanScope();
		System.out.println("sayBeanScopeTest..1..");

	}
	@Test
	public void sayBeanScopeTest2() {
		beanScope.sayBeanScope();
		System.out.println("sayBeanScopeTest..12..");

	}
	
	@Test
	public void ApplicationContextTest() {
		System.out.println("Spring init");
	    ApplicationContext factory=new FileSystemXmlApplicationContext("classpath*:bean*.xml"); 
	    factory.getBean("beanScope");
	}
}
