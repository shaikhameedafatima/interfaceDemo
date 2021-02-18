import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 numbers:");
		int num=s.nextInt();
	
		if(num%2==0)
		{
			System.out.println("the number is even" );
			
		}
		else
		{
			System.out.println("the number is odd");
		}
	}

}
