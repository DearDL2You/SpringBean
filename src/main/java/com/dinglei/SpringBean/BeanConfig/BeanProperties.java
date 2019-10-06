package com.dinglei.SpringBean.BeanConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
public class BeanProperties {
	@Value("${user.driver}")
	private String driver;
	@Value("${user.url}")
	private String url;
	@Value("${user.username}")
	private String username;
	@Value("${user.password}")
	private String password;
	@Bean
	public BeanProperManager BeanProperManager() {
		System.out.println("BeanProperties---driver=" + driver + "---url=" + url + "---username=" + username + "---password=" + password );
		return new BeanProperManager(url,username,password);
	}

}
