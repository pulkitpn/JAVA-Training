package com.genpact.day1;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter num1 : ");
		num1  = scanner.nextInt();
		
		System.out.println("Enter num2 : ");
		num2 = scanner.nextInt();
		
		System.out.println("Enter num3");
		num3 = scanner.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("num1 is greatest");
		}
		if(num2>num1 && num2>num3) {
			System.out.println("num2 is greatest");
		}
		else {
			System.out.println("num3 is greatest");
		}

	}

}
