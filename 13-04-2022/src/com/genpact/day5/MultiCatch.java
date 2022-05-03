package com.genpact.day5;

public class MultiCatch {
	public static void main(String[] args) {
		String s = "Java full stack";
		int a [] = {0,1,2,3,4,5};
		try {
//			s = null;
			int len = s.length();
			System.out.println("String length : "+len);
			int b = 6;
			System.out.println(a[b]);
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("Exception......"+e);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Nullpointer......"+e);
			System.out.println(e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Exception caught....."+e);
			System.out.println(e.toString());
		}
	}

}
