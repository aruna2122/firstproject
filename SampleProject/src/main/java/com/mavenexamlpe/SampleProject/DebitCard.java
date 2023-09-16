package com.mavenexamlpe.SampleProject;

public class DebitCard  implements Payment {

	@Override
	public String Pay() {
		
		return "payment done through debit card";
	}

}



