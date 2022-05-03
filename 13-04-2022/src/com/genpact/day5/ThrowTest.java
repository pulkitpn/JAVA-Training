package com.genpact.day5;

public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 20, y = 0;
		
		try {
			int z = x/y;
			System.out.println("result : "+z);
			throw new ArithmeticException();
//			ArithmeticException a = new ArithmeticException("Hello throw");
//			throw a;
//			System.out.println("Normal flow");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("arithmatic exception  : "+e);
			System.out.println(e.getMessage());
		}

	}

}
