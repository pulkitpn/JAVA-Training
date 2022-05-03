package com.genpact.day8;

public class MyThread implements Runnable{
	int a = 20 , b = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		Thread t = new Thread(t1);
		t.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		addition();
		subtraction();
		multiplication();
		
	}
	
	void multiplication() {
		int multi = a*b;
		System.out.println("multiplication : "+multi);
	}
	void subtraction() {
		int sub = a-b;
		System.out.println("subtraction : "+sub);
	}
	void addition() {
		int sub = a+b;
		System.out.println("addition : "+sub);
	}
	

}
