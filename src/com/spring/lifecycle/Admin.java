package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Admin implements PersonInterface{

	@PostConstruct
	public void init() {
		System.out.println("Connected with DB");
	}
	@Override
	public void name() {
		// TODO Auto-generated method stub
		
		System.out.println("I am Admin");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Not Connected with DB");
	}

}
