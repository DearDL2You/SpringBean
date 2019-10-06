package com.dinglei.SpringBean.BeanIOC;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dinglei.SpringBean.BeanIOC.BeanCollection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:beanScope.xml"})  
public class BeanCollectionTest {


	@Autowired
	private List<BeanCollection> beanCollectionList;
	
	@Test
	public void BeanCTest() {
		System.out.println("BeanCollectionTest : 执行");
		for (BeanCollection list : beanCollectionList) {
			System.out.println(list.toString());
		}
	}
	
}
