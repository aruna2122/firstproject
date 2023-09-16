package com.predicateExample;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PreJoinDemo {
	
	public static void main(String[]args) {
		Employee e1 = new Employee("Anil","Chenni","Devops");
		Employee e2 = new Employee("Rani","Puni","Networking");
		Employee e3 = new Employee("Ashoke","Hyderabad","Db");
		Employee e4 = new Employee("Ganesh","Hyderabad","Db");
		
		List<Employee> emps = Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee> p1 = (e)-> e.location.equals("Hyderabad");
		Predicate<Employee> p2 = (e)-> e.dept.equals("Db");
		Predicate<Employee> p3 = (e)-> e.name.startsWith("A");
		
		Predicate<Employee> p = p1.or(p2).or(p3);
		
		for(Employee e : emps) {
			if (p.test(e)) {
				System.out.println(e.name);
			}
		}

	}

}
