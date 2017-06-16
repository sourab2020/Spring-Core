package com.trng.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class CustomerService {
	@Value("Hello Everyone")
	String message;
	
	@Value("20")
	Integer value;

	public String getMessage() {
	  return message;
	}

	public void setMessage(String message) {
	  this.message = message;
	}

	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method after properties are set : " + message);
	  System.out.println("Setting the Integer value:"+value);
	}

	@PreDestroy
	public void cleanUp() throws Exception {
	  System.out.println("The Spring Container is Destroyed");
	}

}
