package com.genpact.day9;

class Demo{
    void disp1(Demo d2) {
        System.out.println("Thread1 waiting for thread2 to release lock");
         synchronized(d2){
          System.out.println("Deadlock occurred"); 
    }
    }

    void disp2(Demo d1) {
        System.out.println(" Thread 2 waiting for thread1 to release lock ");
        synchronized(d1) {
            System.out.println("Deadlock occured");
        }
    }
}
class Thread1 extends Thread{
    Demo d1 , d2;
 
    public Thread1(Demo d1, Demo d2) {
        super();
        this.d1 = d1;
        this.d2 = d2;
    }
    public void run() {
        synchronized(d1) {
            try {
                Thread.sleep(1000);
            }catch (Exception e) {
                // TODO: handle exception
            }d2.disp2(d2);
        }
    }
}
class Thread2 extends Thread {
    Demo d1 , d2;
 
    public Thread2(Demo d1, Demo d2) {
        super();
        this.d1 = d1;
        this.d2 = d2;
    }
    public void run() {
        synchronized(d2) {
            try {
                Thread.sleep(1000);
            }catch (Exception e) {
                // TODO: handle exception
            }d1.disp1(d1);
        }
    }
}
public class DeadLock{
	public static void main(String arag[]) {
		Demo d1=new Demo();
		Demo d2=new Demo();
		Thread1 t1=new Thread1(d1, d2);
		Thread2 t2=new Thread2(d1, d2);
		t1.start();
		t2.start();
		System.out.println("jhg");
	}
	
}
