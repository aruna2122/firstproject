package com.collectors;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CollectorsDemo1 {




	private static Collectors collectors;

	public static void main(String[] args) {

		Person p1 = new Person("john","usa");
		Person p2 = new Person("steven","japan");
		Person p3 = new Person("Ashok","India");
		Person p4 = new Person("David", "china");
		Person p5 = new Person("Cathy","India");
		

		List<Person> Personslist = Arrays.asList(p1, p2, p3, p4, p5);


List<String> Indians = Personslist.stream().filter(p-> p.country.equalsIgnoreCase("India")).map(s->s.name).collect(collectors.toList());

		System.out.println(Indians);
	}
}




