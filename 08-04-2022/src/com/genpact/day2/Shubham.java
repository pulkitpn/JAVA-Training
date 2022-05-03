package com.genpact.day2;

import java.util.Scanner;

class SBIBank{
	int bankId;
	String bankAddr;
	
	public SBIBank(int bankId,String bankAddr) {
		this.bankId = bankId;
		this.bankAddr = bankAddr;
	}
	
	
}

class AxisBank{
	int bankId;
	String bankAddr;
	
	public AxisBank(int bankId,String bankAddr) {
		this.bankId = bankId;
		this.bankAddr = bankAddr;
	}
}

public class Shubham {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter SBI Bank data");
		System.out.println("Enter bank id");
		int sbiBankId = sc.nextInt();
		String sbiBankAddr = sc.next();
		
		SBIBank sbi = new SBIBank(sbiBankId,sbiBankAddr);
		
		
		System.out.println("Enter AxisBank details");
		System.out.println("Enter bank id");
		int axisBankId = sc.nextInt();
		System.out.println("Enter bank addr");
		String axisBankAddr = sc.next();
		
		AxisBank axisBank = new AxisBank(axisBankId, axisBankAddr);
		
		if(sbi.bankId==axisBank.bankId) {
			System.out.println("matched");
		}
		
		
		
		
		
		
		
	}
}
