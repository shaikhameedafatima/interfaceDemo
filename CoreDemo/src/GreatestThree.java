import java.util.Scanner;

public class GreatestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner s =new Scanner(System.in);
		System.out.println("enter 3 numbers:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
	if(a>b && a>c)
	{
		System.out.println(a+" is greatest");
	}
	else if(b>c )
	{
		System.out.println(b+ " is greatest");
	}
	else
	{
		System.out.println(c+ " is greatest");

	}
	}

}
