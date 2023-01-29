package com.spring.ann;

import org.springframework.stereotype.Component;

@Component

public class TennisSport implements SportInterface{

	@Override
	public void mySport() {
		// TODO Auto-generated method stub
		System.out.println("I am Tennis");
		
	}

}
