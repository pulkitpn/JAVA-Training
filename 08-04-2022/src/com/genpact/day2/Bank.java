//package com.genpact.day2;
//
//import java.util.Scanner;
//
//public class Bank {
//
//	String name;
//	String bankname;
//	int accNo;
//	long phone;
//
//	public Bank(String name, String bankname, int accNo, long phone) {
//		super();
//		this.name = name;
//		this.bankname = bankname;
//		this.accNo = accNo;
//		this.phone = phone;
//	}
//
//	@Override
//	public String toString() {
//		return "Bank [name=" + name + ", bankname=" + bankname + ", accNo=" + accNo + ", phone=" + phone + "]";
//	}
//
//	void display() {
//		System.out.println("Person details: ");
//		System.out.println("Bank : " + bankname + "Name : " + name + "Account No : " + accNo + "Phone : " + phone);
//	}
//
//}
//
//class SBI extends Bank {
//
//	public SBI(String name, String bankname, int accNo, long phone) {
//		super(name, bankname, accNo, phone);
//	}
//
//}
//
//class Axis extends Bank {
//
//	public Axis(String name, String bankname, int accNo, long phone) {
//		super(name, bankname, accNo, phone);
//		
//
//		Scanner sc = new Scanner(System.in);
//		Bank[] bank = new Bank[2];
//		System.out.println("Enter Axis Bank details..........");
//		for (int x = 0; x < bank.length; x++) {
//			System.out.println("Enter Bank name : ");
//			bankname = sc.next();
//			System.out.println("Enter Name : ");
//			name = sc.next();
//			System.out.println("enter acc no : ");
//			accNo = sc.nextInt();
//			System.out.println("Enter Phone no : ");
//			phone = sc.nextLong();
//
//			bank[x] = new Bank(name, bankname, accNo, phone);
//
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Bank[] bank = new Bank[2];
//		System.out.println("Enter SBI Bank details..........");
//		for (int x = 0; x < bank.length; x++) {
//			System.out.println("Enter Bank name : ");
//			bankname = sc.next();
//			System.out.println("Enter Name : ");
//			name = sc.next();
//			System.out.println("enter acc no : ");
//			accNo = sc.nextInt();
//			System.out.println("Enter Phone no : ");
//			phone = sc.nextLong();
//
//			bank[x] = new Bank(name, bankname, accNo, phone);
//
//		}
//	}
//}
