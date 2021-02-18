import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter no.of elements:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter all elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			sum=sum+a[i];
			
		}
		System.out.println("sum:" +sum);
		s.close();
	}
}
