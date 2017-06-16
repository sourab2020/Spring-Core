package com.trng.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.trng.beans.CustomerService;

@Configuration
@ComponentScan(basePackages={"com.trng.beans"})

public class SpringConfig {
	
	@Bean
	public CustomerService getDetails(){
		return new CustomerService();
	   
	}

}
