package com.dinglei.SpringBean.BeanIOC.Impl;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.dinglei.SpringBean.BeanIOC.BeanCollection;
@Component
@Order(2)
public class BeanCollectionTwoImpl implements BeanCollection{

	public void saveBeanCollection() {
		// TODO Auto-generated method stub
		System.out.println("BeanCollectionTwoImpl --- " );
	}

}
