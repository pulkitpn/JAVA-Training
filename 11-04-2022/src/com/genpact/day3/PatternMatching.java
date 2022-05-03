package com.genpact.day3;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserMainCode1{
	public static int validate(String number) {
		Pattern pat = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		if(pat.matcher(number).matches()==true) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
}

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone number");
		String phone = sc.next();
		UserMainCode1 userMainCode = new UserMainCode1();
		int result = userMainCode.validate(phone);
		
		if(result==1) {
			System.out.println("Valid number");
		}
		else {
			System.out.println("Invalid number");
		}

	}

}
