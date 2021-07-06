package com.jyq.demo.dto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jyq2Dto {
	@Autowired
	private JyqDto jd;
	public Jyq2Dto( ) {
		System.out.println("Jyq2Dto ...");
	}
}
