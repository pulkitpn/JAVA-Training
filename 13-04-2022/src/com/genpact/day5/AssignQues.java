package com.genpact.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class TempStudent{
	public String name;
	public int age;
	public Address address;
	public List<MobileNumber> mobileNumber;
	public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	
}

class Student{
	private String name;
	private int age;
	private Address address;
	private List<MobileNumber> mobileNumber;
	public Student(String name, int age, Address address, List<MobileNumber> mobileNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumber = mobileNumber;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<MobileNumber> getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(List<MobileNumber> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
	
}

class Address{
	private String zipcode;

	public Address(String zipcode) {
		super();
		this.zipcode = zipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
}

class MobileNumber{
	private String number;
	

	public MobileNumber(String number) {
		super();
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}

public class AssignQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std1 = new Student("jayesh", 22, new Address("1235"), Arrays.asList(new MobileNumber("3333"), new MobileNumber("1234")));
		Student std2 = new Student("pulkit", 23, new Address("1234"), Arrays.asList(new MobileNumber("1233") , new MobileNumber("1234")));
		Student std3 = new Student("ansh", 21, new Address("1235"), Arrays.asList(new MobileNumber("3333") , new MobileNumber("3254")));
		Student std4 = new Student("shubham", 24, new Address("1222"), Arrays.asList(new MobileNumber("1235") , new MobileNumber("1234")));
		Student std5 = new Student("anshul", 25, new Address("4561"), Arrays.asList(new MobileNumber("1233") , new MobileNumber("1234")));
		
		
		List<Student> students = Arrays.asList(std1, std2, std3 , std4 , std5);
		
		

	}

}
