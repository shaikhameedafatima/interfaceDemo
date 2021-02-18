package com.valuemomentum.training.concurrency;
class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName()+" in control");
	}
}
//Driver Class

public class YieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t=new MyThread2();
		t.start();
		for(int i=0;i<5;i++)
		{
			//control passes to child thread 
			Thread.yield();
			//after execution of child thread
			//main thread takes over
			System.out.println(Thread.currentThread().getName()+"in control");
		}
	}

}
