package com.valuemomentum.training.concurrency;

public class ThreadRunExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new HeavyWorkRunnable(),"t1");
		Thread t2=new Thread(new HeavyWorkRunnable(),"t2");
	System.out.println("starting runnable threads");
	t1.start();//invoke run
	t2.start();
	System.out.println("Runnable threads has been started");
	Thread t3=new Thread(new HeavyWorkRunnable(),"t3");
	Thread t4=new Thread(new HeavyWorkRunnable(),"t4");
	System.out.println("starting mythrreads");
	t3.start();
	t4.start();
	System.out.println("my threads has been started");
	}
	
}
