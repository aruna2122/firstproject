package com.mavenexamlpe.SampleProject;

public class CreditCard implements Payment{
	

		@Override
		public String Pay() {
			
			return "payment done through credit card";
		}
}
