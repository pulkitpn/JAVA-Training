package com.genpact.day5;

import java.util.Scanner;

public class CustomTest {
	
	void validWeight(int weight) throws WeightLimitException {
		if(weight>15) {
			System.out.println("Exceeded");
			throw new WeightLimitException(weight);
		}
			else {
			System.out.println("Fly");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomTest cu = new CustomTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the weight");
		for(int i = 0 ; i<2 ;i++) {
			try {
				cu.validWeight(sc.nextInt());
			}
			catch (WeightLimitException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}

	}

}
