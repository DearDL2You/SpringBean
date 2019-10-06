package com.dinglei.SpringBean.BeanIOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeanService {

//	@Autowired   //Autowired成员变量注入
	private BeanDAO beanDao;
	
	private static String Beanurl = "BeanUrl";
	
	
//	@Autowired  //Autowired set方法注入
	public void setBeanDao(BeanDAO beanDao) {
		this.beanDao = beanDao;
	}
	
	@Autowired //Autowired 构造器注入
	public BeanService(BeanDAO beanDao) {
		this.beanDao = beanDao;
	}
	
	public void sayBeanService() {
//		System.out.println("BeanService : 执行");
		beanDao.sayBeanDAO();
	}
}
