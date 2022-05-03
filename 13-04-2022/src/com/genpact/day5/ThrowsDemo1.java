package com.genpact.day5;

public class ThrowsDemo1 {
	
	static void throwsOne()  throws NullPointerException, ArrayIndexOutOfBoundsException{
		int a[] = {0,1,2,3};
		System.out.println(a[6]);
		String n = null;
		System.out.println(n.length());
		System.out.println("INside throwOne");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throwsOne();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NullPointer");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Out of bound");
		}

	}

}
