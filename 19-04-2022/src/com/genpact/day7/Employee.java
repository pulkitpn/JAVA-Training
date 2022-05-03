package com.genpact.day7;

import java.util.Date;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;

	public Employee(String name, String department, Date dateOfJoining, int age, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", dateOfJoining=" + dateOfJoining + ", age="
				+ age + ", salary=" + salary + "]";
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
