package com.iospring.beans;

public class OutputHelper {
	
	IOOutputGenerator outputGenerator;

	public OutputHelper(){
		outputGenerator = new csvOutputGenerator();
	}

	public void generateOutput(){
		outputGenerator.generateOutput();
	}

}
