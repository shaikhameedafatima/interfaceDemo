package com.valuemomentum.training.concurrency;

public  class HeavyWorkRunnable implements Runnable{
	public void run()
	{
		System.out.println("doing heavy processing=start"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
			//get database connect,delete unused data from DB doDBProcessing();		
 		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("doing heavy processing -END "+Thread.currentThread().getName());
	}
	private void doDBprocessing() throws InterruptedException
	{
		Thread.sleep(5000);
	}

}
