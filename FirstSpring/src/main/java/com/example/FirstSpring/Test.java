package com.example.FirstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[]args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		UPI u = context.getBean("upi", UPI.class);
		System.out.println(u.hashCode());

	}

}
