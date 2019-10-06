package com.dinglei.SpringBean.BeanConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean(initMethod = "init",destroyMethod = "destroy")
	public ConfigDeamOne ConfigDeamOne() {
		System.out.println("BeanConfiguration");
		return new ConfigDeamOne();
	}
}
