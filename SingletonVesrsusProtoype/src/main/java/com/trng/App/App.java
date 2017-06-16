package com.trng.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.trng.spring.SingletonVesrsusProtoype.CustomerService;

public class App {

		
	    public static void main( String[] args )
	    {
	    	ApplicationContext context  = new AnnotationConfigApplicationContext(SpringConfig.class);

	    	CustomerService custA = (CustomerService)context.getBean("customerService");
	    	custA.setMessage("Message by custA");
	    	System.out.println("Message : " + custA.getMessage());

	    	//retrieve it again
	    	CustomerService custB = (CustomerService)context.getBean("customerService");
	    	System.out.println("Message : " + custB.getMessage());
	    }

	}


