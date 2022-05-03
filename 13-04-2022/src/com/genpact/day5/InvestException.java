package com.genpact.day5;

public class InvestException extends Exception{
	public InvestException(int x) {
		super();
		System.out.println(Math.abs(70000-x)+"Rs is less in your salary");
	}

}
