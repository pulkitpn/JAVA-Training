package com.genpact.day5;

public class WeightLimitException extends Exception {

	public WeightLimitException(int x) {
		super();
		System.out.println(Math.abs(15-x)+"kg");
	}

}
