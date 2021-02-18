import java.util.Scanner;

public class Employee {
	
	
	void getinfo(int salary,int hour)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the salary and hour:");
		int p=s.nextInt();
		int p1=s.nextInt();	

		
		if(p<500)
		{
			int sal=p+10;
			System.out.println("the salary is:");
		}
	}
	
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.getinfo(0,0 );

	}

}
