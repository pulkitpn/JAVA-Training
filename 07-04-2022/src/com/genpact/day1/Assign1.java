package com.genpact.day1;

import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**OUTPUT

		Welcome to BhartiyaTasteBuds.com

		To order South Indian Dish, Enter 1
		To order North Indian Dish, Enter 2
		To order Rajasthani Dish, Enter 3
		To order Gujrati Dish, Enter 4
		To order Bengali Dish, Enter 5
		To order Desserts, Enter 6
		To Exit, Enter 9

		Enter your choice::
		2
		Welcome to North Indian Food Court

		You get:
		Chole Bhature : 2 Pieces:
		Litti Chokha : 4 Pieces:*/
		
		while (true) {
			System.out.println("Welcome to BhartiyaTasteBuds.com");
			System.out.println("To order South Indian Dish, Enter 1");
			System.out.println("To order Rajasthani Dish, Enter 3");
			System.out.println("To order Gujrati Dish, Enter 4");
			System.out.println("To order Bengali Dish, Enter 5");
			System.out.println("To order Desserts, Enter 6");
			System.out.println("To Exit, Enter 9");
			
			System.out.println("Enter the choice : ");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("Welcome to South Indian food court");
				System.out.println("You get : \n Idli : 2 Pieces \n Vada : 2 Pieces");
				break;

			case 2:
				System.out.println("Welcome to Rajasthani food court");
				System.out.println("You get : \n Daal Baati : 2 Pieces \n Ghevar : 3 Pieces");
				break;
				
			case 3:
				System.out.println("Welcome to Gujrati food court");
				System.out.println("You get : \n Dhokla : 1Piece \n Jalebi : 5 Piece");
				break;
			}
			break;
					
			
		}

	}

}
