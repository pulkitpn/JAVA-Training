package com.genpact.day2;

public class Student {
	int rollno; String name;
	int fee; String schoolname;
	
	public Student() {
		System.out.println("Default constructor");
		
	}
	
	
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	


	public Student(int rollno, String name, int fee, String schoolname) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
		this.schoolname = schoolname;
	}



	void display() {
		System.out.println("Name:"+name+" roll no:"+rollno+" Fees:"+fee+" School:"+schoolname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		Student st1 = new Student(101, "abc");
		Student st2 = new Student(101, "abc", 4000, "MNS");
		st1.display();
		st2.display();
		st.display();
		System.out.println(st);

	}

}
