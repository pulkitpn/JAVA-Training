package com.genpact.day3;

abstract class Employee{
	private String name;
	private int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	void display(){
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
	}
}


public class AbsEmployee extends Employee {
	public AbsEmployee(String name, int id) {
		super(name,id);
		
	}
	
	public static void main(String[] args) {
		AbsEmployee abst = new AbsEmployee("ABC", 101);
		abst.display();
	}
	

}
