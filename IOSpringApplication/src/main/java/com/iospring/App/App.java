package com.iospring.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.iospring.beans.OutputHelper;
import com.iospring.config.SpringConfig;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appcontext = new AnnotationConfigApplicationContext(SpringConfig.class);
		OutputHelper helper = appcontext.getBean(OutputHelper.class);
		helper.generateOutput();

	}

}
