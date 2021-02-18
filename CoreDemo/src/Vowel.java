import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the characters");
		char c =s.next().charAt(0);
		
	
	if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='o'||c=='O'||c=='u')
	{
		System.out.println("the number is vowel");
		
	}
	else
	{
		System.out.println("the char is not vowel");
	}

}
}

