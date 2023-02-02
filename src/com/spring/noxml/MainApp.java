package com.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfige.class);
		
		Manger ms = context.getBean("manger",Manger.class);
		System.out.println(ms.getEmail());
		System.out.println(ms.getTeam());
		
		context.close();

	}

}
