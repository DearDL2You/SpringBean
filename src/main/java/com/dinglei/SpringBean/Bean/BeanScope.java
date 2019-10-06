package com.dinglei.SpringBean.Bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class BeanScope {

	public void sayBeanScope() {
		System.out.println("sayBeanScope : " + this.hashCode());
	}
	@PostConstruct
	public void initScope() {
		System.out.println("sayBeanScope ---init" );
	}
	@PreDestroy
	public void destoryScope() {
		System.out.println("sayBeanScope ---destory" );

	}
}
