package com.spring.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring.noxml")
public class SpringConfige {



	@Bean
	public MasterInterface myMaster() {
	
	//Master ms = new Master();
	return new Master(mysport());
	
	}
	@Bean
	public SportInterface mysport() {
	return new Sport();
	}

}
