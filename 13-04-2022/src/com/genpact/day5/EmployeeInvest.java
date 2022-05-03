package com.genpact.day5;

import java.util.Scanner;

public class EmployeeInvest {
	
	void validInvest(int salary) throws InvestException{
		if(salary>70000) {
			System.out.println("Great!! You can Invest in scheme");
			
		}
		else {
			System.out.println("Sorry....You cannot invest");
			throw new InvestException(salary);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeInvest ein = new EmployeeInvest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary : ");
		try {
		ein.validInvest(sc.nextInt());
		}
		catch (InvestException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
