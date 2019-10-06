package com.dinglei.SpringBeanConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dinglei.SpringBean.BeanConfig.ConfigDeamOne;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:bean*.xml"})  
public class BeanConfigTest {

	@Autowired
	private ConfigDeamOne configDeamOne;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void sayBeanConfigTest() {
		configDeamOne.sayConfigOne();
		System.out.println("BeanConfigTest..1..");
	}
	
	@Test
	public void BeanGTest() {
		applicationContext.getBean("beanGenericTest");
		System.out.println("BeanConfigTest..1..");

	}
}
