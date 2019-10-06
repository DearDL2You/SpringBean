package com.dinglei.SpringBean.BeanIOC;


import org.springframework.stereotype.Repository;

@Repository
public class BeanDAO {

	public void sayBeanDAO() {
		System.out.println("sayBeanDAO : 执行");
	}
}
