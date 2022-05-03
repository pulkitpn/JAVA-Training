package com.genpact.day5;

import java.util.Scanner;

public class UnreachableCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the first number : ");
			x = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the second number : ");
			y = Integer.parseInt(sc.nextLine());
			
			int z = x/y;
			System.out.println("Z = "+z);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exceptio9n thrown : "+e);
		}
		catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("Exception thrown : "+ae);
		}
		catch (NumberFormatException ne) {
			// TODO: handle exception
			System.out.println("Exception thrown : "+ne);
		}

	}

}
