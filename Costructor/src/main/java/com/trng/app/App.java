package com.trng.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.trng.beans.CustomerService;
import com.trng.config.SpringConfig;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appcontext = new AnnotationConfigApplicationContext(SpringConfig.class);

    	    	CustomerService cust = (CustomerService)appcontext.getBean(CustomerService.class);
               
    	    	((ConfigurableApplicationContext) appcontext).close();

	}

}
