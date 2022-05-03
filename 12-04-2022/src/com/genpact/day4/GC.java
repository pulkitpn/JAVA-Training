package com.genpact.day4;
class Person{
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize called");
		super.finalize();
	}
}

public class GC {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		person1 = null;
		person2 = null;
		System.gc();
	}

	
	
	

}
