package com.mavenexamlpe.SampleProject;

public class BillCollector {
	private Payment p;
	
	public String Pay() {
		return p.Pay();
	}



public Payment getP() {
	return p;
}

public void setP(Payment p) {
	this.p = p;
}
public void bill() {
  
  String pay =p.Pay();
  System.out.println(pay);
}
}


