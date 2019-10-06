package com.dinglei.SpringBean.BeanConfig;

public class ConfigDeamOne {
	public void sayConfigOne() {
		System.out.println("sayConfigOne --- " );
	}
	
	public void init() {
		System.out.println("sayConfigOne ---init " );
	}
	
	public void destroy() {
		System.out.println("sayConfigOne ---destroy " );
	}
}
