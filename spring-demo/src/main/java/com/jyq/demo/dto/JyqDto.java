package com.jyq.demo.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JyqDto {
	@Autowired
	private Jyq2Dto jd2;

	public JyqDto( ) {
		System.out.println("JyqDto ...");
	}

	public void getName(){
		System.out.println("xxxxJyq");
	}
}
