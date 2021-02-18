
public class MainThread  extends Thread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainThread Objex=new MainThread();
		Objex.create();
		System.out.println("this is the main thread");

	}
	public void create()
	{
		Thread Objth=new Thread(this);
		Objth.start();
	}

	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("this is the child thread");
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{

			}
		}
	}
}
