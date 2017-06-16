package com.iospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.iospring.beans.OutputHelper;

@Configuration
@ComponentScan(basePackages ={"com.iospring.beans"})
public class SpringConfig {
	
	@Bean
	public OutputHelper getdetails(){
		return new OutputHelper();
	}

}
