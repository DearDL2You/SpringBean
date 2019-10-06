package com.dinglei.SpringBean.BeanIOC.Impl;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.dinglei.SpringBean.BeanIOC.BeanCollection;
@Component
@Order(5)
public class BeanCollectionOneImpl implements BeanCollection{

	public void saveBeanCollection() {
		// TODO Auto-generated method stub
		System.out.println("BeanCollectionOneImpl --- " );
	}

}
