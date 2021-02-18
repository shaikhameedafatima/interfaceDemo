import java.util.Scanner;

public class StudentDetail {

	public static void main(String [] args) {
		int m1,m2,m3, result,rollno;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the roll number:");
		rollno=s.nextInt();
		System.out.println("enter the name of the student:");
		char name=s.next().charAt(0);
		System.out.println("enter the branch:");
		char branch=s.next().charAt(0);
		System.out.println("enter the marks obtained in all subjects:");
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();
		result=(m1+m2+m3);
		System.out.println("the total marks obtained are:"+result);
		float p=(result)%100;
		System.out.println("the percentage of the student is"+p);		
		
	}

}
