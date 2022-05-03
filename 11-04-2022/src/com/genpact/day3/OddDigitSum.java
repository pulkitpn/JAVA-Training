package com.genpact.day3;

import java.util.Scanner;

class UserMainCode{
	public static int checkSum(int num) {
		
		int lastDigit = 0;
		int oddSum = 0;
		
		while(num!=0) {
			lastDigit = num%10;
			
			if(lastDigit%2 !=0) {
				oddSum+=lastDigit;
			}
			
			num = num/10;
		}
		
		
		
		return oddSum;
		
	}
}

public class OddDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number  : ");
		
		num = sc.nextInt();
		
		result = UserMainCode.checkSum(num);
		System.out.println(result);

	}

}
