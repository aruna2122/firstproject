package com.employesorting;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;
public class Employestream {
	

public static void main(String[]args) {

List<Employe> Employelist = new ArrayList<>();
		
Employelist.add(new Employe(1,"Thasi",32,"Female","HR",2011,2500.0));
 Employelist.add(new Employe(2,"Smith",25,"Male","Sales",2015,1300.0));
 Employelist.add(new Employe(3,"David",29,"Male","Infrastructure",2012,18000.0));
 Employelist.add(new Employe(4,"Orien",28,"Male","Development",2014,32500.0));
 Employelist.add(new Employe(5,"Charles",27,"Male","HR",2013,22700.0 ));
 Employelist.add(new Employe(6,"Cathy",43,"Male","Security",2016,10500.0));
Employelist.add(new Employe(7,"Ramesh",35,"Male","Finance",2010,27000.0));
Employelist.add(new Employe(8,"Suresh",31,"Male","Development",2015,34500.0));
Employelist.add(new Employe(9,"Gita",24,"Female","Sales",2016,11500.0));
Employelist.add(new Employe(10,"Mahesh",38,"Male","Security",2015,11000.5));
Employelist.add(new Employe(11,"Gouri",27,"Female","Infrastructure",2014,15700.0));
Employelist.add(new Employe(12,"Nithin",25,"Male","Development",2016,28200.0));
Employelist.add(new Employe(13,"Swathi",27,"Female","Finance",2013,21300.0));
Employelist.add(new Employe(14,"Buttler",24,"Male","Sales",2017,10700.5));
Employelist.add(new Employe(15,"Ashok",23,"Male","Infrastructure",2018,12700.5));
Employelist.add(new Employe(16,"Sanvi",26,"Female","Development",2015,28900.0));
	
		
//1.how many male and female employees are there in the organization//
Map<String,Long>maleFemales =  Employelist.stream().collect(Collectors.groupingBy(employe::getGender),Collectors.counting());
System.out.println("malefemales");
System.out.println("=====================================================================");



	}

}
