package com.jyq.demo.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NotVeryUsefulAspect {

	@Pointcut("execution(* com.jyq.demo.dto.JyqDto.*(..))")
	public void anyOldTransfer() {}


	@Before("anyOldTransfer()")
	public void before(){
		System.out.println("xxxxxxxxxxxxxxxxx");
	}
}
