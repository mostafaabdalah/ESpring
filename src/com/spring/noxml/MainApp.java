package com.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfige.class);
		
		MasterInterface ms = context.getBean("myMaster",MasterInterface.class);
		ms.name();
		ms.getSport();
		
		context.close();

	}

}
