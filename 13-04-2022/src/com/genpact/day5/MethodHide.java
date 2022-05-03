package com.genpact.day5;

class ParentClass{
	public static void classMethod() {
		System.out.println("Class method in super class");
	}
	
	public void NonStatic() {
		
		System.out.println("Instance method in parent class");
	}
}


class ChildClass extends ParentClass{
	public static void classMethod() {
		System.out.println("Clas method in child class");
	}
	
	public void NonStatic() {
		System.out.println("Instance method in child class");
	}
}



public class MethodHide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass p = new ChildClass();
		p.classMethod();
		p.NonStatic();
		
		ChildClass c = new ChildClass();
		c.classMethod();
		c.NonStatic();
		
		ParentClass p1 = new ParentClass();
		p1.classMethod();
		p1.NonStatic();

	}

}
