package com.valuemomentum.training.concurrency;
class Test extends Thread
{
	public void run()
	{
		System.out.println("Thread"+Thread.currentThread().getId()+"is running");
		
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n=8;//number of threads
           for(int i=1;i<=n;i++)
           {
        	   Test t=new Test();
        	   t.start();
           }
	}

}
