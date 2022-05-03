package com.genpact.day1;

import javax.sound.midi.Soundbank;

public class DemoClass {

	public static void main(String[] args) {
		System.out.println("Hellos");
		byte myb1, myb2;
		myb1 = 127; myb2 = -48;int num1, num2, num3;long long1;
		num1 = 123; num2 = 700000; num3 = 900000;long1 = 120983102L;
		System.out.println("Byte = "+myb1+ "\nByte2 = "+myb2);
		System.out.println("result "+num3*num2);
		int num5= 11;
		int num6 = 14;
		int result;
		result = num5 & num6;
		System.out.println("& = "+result);
		result = num5 | num6;
		System.out.println("| = "+result);
		result = num5 ^ num6;
		System.out.println("^ = "+result);
		result =  ~ num6;
		System.out.println("~ = "+result);
	}
}
