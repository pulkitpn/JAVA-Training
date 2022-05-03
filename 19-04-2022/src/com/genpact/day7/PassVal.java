package com.genpact.day7;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserMainCode2{
	public static int validate(String password) {
		String Pas_pat = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&?*$]).{8,20}$";
		Pattern pat = Pattern.compile(Pas_pat);
		if(pat.matcher(password).matches()==true) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
}

public class PassVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password : ");
		String pas = sc.next();
		UserMainCode2 userMainCode2 = new UserMainCode2();
		int validPass = userMainCode2.validate(pas);
		if(validPass==1) {
			System.out.println("Valid number");
		}
		else {
			System.out.println("Invalid number");
		}

	}

}
