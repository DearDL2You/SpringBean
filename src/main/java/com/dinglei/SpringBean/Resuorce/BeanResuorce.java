package com.dinglei.SpringBean.Resuorce;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class BeanResuorce {
	@Autowired
	private ApplicationContext applicationContext;
	@Value("${user.driver}")
	private String driver;
	@Value("${user.url}")
	private String url;
	@Value("${user.username}")
	private String username;
	@Value("${user.password}")
	private String password;
	//@Value("#{}") 表示SpEl表达式通常用来获取bean的属性，或者调用bean的某个方法。当然还有可以表示常量
	@Value("#{1}")
	private int number; //获取数字 1
	
	@Value("#{'Spring Expression Language'}") //获取字符串常量
	private String str;
	
//	@Value("#{beanService.Beanurl}") //获取bean的属性
//	private String jdbcUrl;

	
	public void BeanResuorce() throws IOException {
//		Resource res = applicationContext.getResource("classpath:beanScope.xml");
		Resource res = applicationContext.getResource("url:https://mvnrepository.com/artifact/org.springframework/spring-test/5.2.0.RELEASE");

		System.out.println("BeanResuorce---BeanResuorce : " + res.contentLength() + " --- " + res.getFilename());
		
		System.out.println("---driver=" + driver + "---url=" + url + "---username=" + username + "---password=" + password );
		
		System.out.println("---number=" + number + "---str=" + str );

		
	} 

//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		// TODO Auto-generated method stub
//		System.out.println("BeanResuorce---setApplicationContext " + applicationContext);
//		this.applicationContext = applicationContext;
//	}
}
