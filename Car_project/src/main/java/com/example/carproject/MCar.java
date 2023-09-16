package com.example.carproject;

public class MCar {
	
	
	
	private DieselEngine dieselEngine;
	
	
	
	
	public DieselEngine getDieselEngine() {
		return dieselEngine;
	}


	public void setDieselEngine(DieselEngine dieselEngine) {
		this.dieselEngine = dieselEngine;
		
	}
	public MCar() {
		System .out.println("Car Class Constructor Called");
	
	}
	 public void drive() {
		
		int result = dieselEngine.start();
		if(result>=1) {
			System.out.println("car started for journey");
		}
		else {
			System.out.println("Engine has some problem");
		}
	}
		
	}
	


