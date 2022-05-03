package com.genpact.day4;
interface A{
	public void Showname(String name); 
}

public class MethodRef {
	
	public static void getData(String data) {
		System.out.println(data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = (String s)->System.out.println(s);
		a.Showname("Method ref.....");
		
		A a1 = MethodRef::getData;
		a1.Showname("getData of methodref");

	}

}
