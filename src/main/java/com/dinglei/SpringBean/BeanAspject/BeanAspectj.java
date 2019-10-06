package com.dinglei.SpringBean.BeanAspject;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeanAspectj {
	
		@Before("execution(* com.dinglei..*(..))")
	    public void BeanAspectjBefore() {
	        System.out.println("BeanAspectjBefore ...........");
	    }
	    @AfterReturning("execution(* com.dinglei..*(..))")
	    public void BeanAspectjAfterReturning() {
	        System.out.println("BeanAspectjAfterReturning!!!");
	    }
	    @AfterThrowing("execution(* com.dinglei..*(..))")
	    public void BeanAspectjAfterThrowing() {
	        System.out.println("BeanAspectjAfterThrowing.......");
	    }
	    
	    @Around("execution(* com.dinglei.SpringBean.Bean..*(..))")
	    public Object BeanAspectjAround(ProceedingJoinPoint pjp) throws Throwable {
	    	
	        System.out.println("BeanAspectjAround.....start..");
	        
	        Object obj = pjp.proceed();
	        
	        System.out.println("BeanAspectjAround.....end..");

	        return obj;
	    }
}
