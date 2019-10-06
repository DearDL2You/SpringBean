package com.dinglei.SpringBean.BeanIOC;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dinglei.SpringBean.BeanIOC.BeanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:beanScope.xml"})  
public class BeanIOCTest {

//	@Autowired
//	private BeanAppContextAware beanAppContextAware;
	@Autowired
	private BeanService beanService;
	@Test
	public void sayBeanAwareTest() {
//		System.out.println("sayBeanAwareTest : " + beanAppContextAware.hashCode());
		System.out.println("BeanIOCTest : 执行" );
		beanService.sayBeanService();
	}
	
}
