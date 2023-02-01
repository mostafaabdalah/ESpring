package com.spring.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.UserInterface;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		
		PersonInterface admin1 = context.getBean("admin",PersonInterface.class);
		
		// retrieve bean from spring container
		
		PersonInterface admin2 = context.getBean("admin",PersonInterface.class);

		
		// call methods on the bean
		
		admin1.name();

		// close the context
		
		context.close();
	}

}
