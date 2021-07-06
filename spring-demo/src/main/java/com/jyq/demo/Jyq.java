package com.jyq.demo;

import com.jyq.demo.config.JyqConfig;
import com.jyq.demo.dto.JyqDto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Jyq {
	public static void main(String[] args) {
		// 获取容器
		ApplicationContext ac =new AnnotationConfigApplicationContext(JyqConfig.class);
		// 获取 bean
		JyqDto bean = ac.getBean(JyqDto.class);
		System.out.println(bean);
	}
}
