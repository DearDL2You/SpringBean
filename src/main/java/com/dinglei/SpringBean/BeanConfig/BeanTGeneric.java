package com.dinglei.SpringBean.BeanConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanTGeneric {
	
	@Autowired
	private BeanGeneric<String> bg1;
	@Autowired
	private BeanGeneric<Integer> bg2;

	@Bean
	public BeanIntegerGeneric beanIntegerGeneric(){
		System.out.println("BeanIntegerGeneric");
		return new BeanIntegerGeneric();
	}
	
	@Bean
	public BeanStringGeneric beanStringGeneric(){
		System.out.println("BeanStringGeneric");
		return new BeanStringGeneric();
	}
	
//	@Bean(name = "beanGenericTest")
//	public BeanGeneric BeanGenericTest() {
//		System.out.println("bg1 = " + bg1);
//		System.out.println("bg2 = " + bg2);
//		return new BeanIntegerGeneric();
//	}
}
