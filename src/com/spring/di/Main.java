package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		/*
		Person person = new Person();
		User user = new User();
		user.getPerson();
		user.setPerson(person);
		*/
		
		
		// load the spring configuration file
		
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

				// retrieve bean from spring container
				
				UserInterface user = context.getBean("user",UserInterface.class);
				
				// call methods on the bean
				
				System.out.println(user.getEmail()+"		" +user.getTeam());
				
				// retrieve bean from spring container
				/*
				PersonInterface person = context.getBean("person",PersonInterface.class);
				
				// call methods on the bean
				person.begin();
				*/
				// close the context
				
				context.close();
				
	}

}
