package com.trng.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.trng.beans.CustomerService;
import com.trng.config.SpringConfig;



public class App {
    public static void main( String[] args )
    {
    	ApplicationContext appcontext = new AnnotationConfigApplicationContext(SpringConfig.class);

    	CustomerService custA = (CustomerService)appcontext.getBean("customerService");
    	custA.setMessage("Message by custA");
    	System.out.println("Message : " + custA.getMessage());

    	//retrieve it again
    	CustomerService custB = (CustomerService)appcontext.getBean("customerService");
    	System.out.println("Message : " + custB.getMessage());
    }

}
