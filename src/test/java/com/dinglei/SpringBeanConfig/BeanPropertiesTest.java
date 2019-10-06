package com.dinglei.SpringBeanConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dinglei.SpringBean.BeanConfig.BeanProperties;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:bean*.xml"})  
public class BeanPropertiesTest {

	@Autowired
	private BeanProperties beanProperties;
	
	@Test
	public void BeanPropertiesTest() {
//		beanProperties.BeanProperManager();
		System.out.println("BeanConfigTest..1..");
	}
}
