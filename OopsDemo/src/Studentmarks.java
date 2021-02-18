import java.util.Scanner;

public class Studentmarks
{
	int rollno;				// instance class,properties declarations
	String name;
	String course;
	int s1;
	int num;
	int s2;
	int s3;
	
	
	void student1()			//method
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the student rollno,name,course,marks:");
		rollno=s.nextInt();
		name=s.next();
		course=s.next();
		s1=s.nextInt();
		s2=s.nextInt();
		s3=s.nextInt();
	}
	  void input()
	  {
		  int p;
		  p=s1+s2;
		  System.out.println("the total marks are"+p);
		  if(s1<s2 )
		  {
			  System.out.println("s1 student is best");
		  }
		  else
		  {
			  System.out.println("s2 student is good");
		  }
	  }
	
	void display()
	{
		System.out.println("the total are"+num);
		
	}
}
