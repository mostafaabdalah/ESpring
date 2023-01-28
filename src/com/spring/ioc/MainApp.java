package com.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Sport football = context.getBean("mySport",Sport.class);
	
	
		football.start();
		
		context.close();
	}

}
