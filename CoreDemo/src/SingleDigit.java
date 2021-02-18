import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		 a=s.nextInt();
		 b=s.nextInt();
		 if(a>-9 && a<9)
		 {
			 System.out.println("the entered no is  "+a+" is single");
		 }
		 else
		 {
			 System.out.println("the enteres is  "+b+" is not single");
		 }
		

	}

}
