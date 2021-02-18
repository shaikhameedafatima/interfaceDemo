import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		
		int i;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("the sum of series"+sum);
	}
}
