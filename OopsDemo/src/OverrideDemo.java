class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int getRateofInterest()
	{
		return 8;
	}
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}
class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}
public class OverrideDemo
{
	public static void main(String[] args)
	{
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		System.out.println("sbi"+s.getRateofInterest());
		System.out.println("icic"+s.getRateofInterest());
		System.out.println("axis"+s.getRateofInterest());
		
	}
}














