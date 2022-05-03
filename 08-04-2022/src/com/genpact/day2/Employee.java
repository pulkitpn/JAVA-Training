package com.genpact.day2;

import java.util.Scanner;

public class Employee {

	int id;
	String name;
	int sal;
	String skill;
	int exp;

	public Employee(int id, String name, int sal, String skill, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.skill = skill;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", skill=" + skill + ", exp=" + exp + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee[] emp = new Employee[4];
		for (int x = 0; x < emp.length; x++) {
			System.out.println("Enter Employee ID:");
			int id = sc.nextInt();
			System.out.println("Enter employee name:");
			String name = sc.next();
			System.out.println("Enter employee salary details:");
			int sal = sc.nextInt();
			System.out.println("Enter employee skills:");
			String skill = sc.next();
			System.out.println("Enter employee experiece:");
			int exp = sc.nextInt();

			emp[x] = new Employee(id, name, sal, skill, exp);

		}

		int maxSal = 0, index = -1;
		Employee maxSalEmp = null;

		for (Employee employee : emp) {
			if (employee.sal > maxSal) {
				maxSal = employee.sal;
				maxSalEmp = employee;
			}
		}
		System.out.println("details of max sal employee = " + maxSalEmp);

	}

}
