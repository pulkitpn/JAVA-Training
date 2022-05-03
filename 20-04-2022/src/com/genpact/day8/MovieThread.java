package com.genpact.day8;

public class MovieThread extends Thread {
	String task;
	
	

	public MovieThread(String task) {
		super();
		this.task = task;
	}
	
	public void run() {
		for(int i=1; i<=5; i++ ) {
			System.out.println("Task : "+task +i);
			try {
				Thread.sleep(1500);
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieThread m1 = new MovieThread("Cut");
		MovieThread m2 = new MovieThread("Show");
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		
		t1.start();
		t2.start();

	}

}
