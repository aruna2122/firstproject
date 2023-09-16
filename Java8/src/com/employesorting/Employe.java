package com.employesorting;

public class Employe {
	
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearofJoining;
	double Salary;
	public Employe(int id, String name, int age, String gender, String department, int yearofJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearofJoining = yearofJoining;
		Salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearofJoining() {
		return yearofJoining;
	}
	public void setYearofJoining(int yearofJoining) {
		this.yearofJoining = yearofJoining;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearofJoining=" + yearofJoining + ", Salary=" + Salary + "]";
	}
	
	




}

	