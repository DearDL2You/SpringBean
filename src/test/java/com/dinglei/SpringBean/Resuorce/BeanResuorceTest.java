package com.dinglei.SpringBean.Resuorce;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dinglei.SpringBean.Resuorce.BeanResuorce;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:beanScope.xml"})  
public class BeanResuorceTest {

//	@Autowired
//	private BeanAppContextAware beanAppContextAware;
	@Autowired
	private BeanResuorce beanResuorce;
	@Test
	public void sayBeanAwareTest() {
//		System.out.println("sayBeanAwareTest : " + beanAppContextAware.hashCode());
		try {
			beanResuorce.BeanResuorce();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
