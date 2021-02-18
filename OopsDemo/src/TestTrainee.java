import java.util.Scanner;

class Trainee //class declaration (it is instance and have properties and methods)
{
	int tId;
	String tName; //define properties
	String technology;
	float salary,stipend;
	// define methods
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter Id,Name,technology,salary of the trainee:");
			tId=s.nextInt();
			tName=s.next();
			technology=s.next();
			salary=s.nextFloat();		
	}
	float calculate()
	{
		stipend=salary-200;
		return stipend;
	}
	void display()
	{
		System.out.println("****traineee Details:*******");
		System.out.println("Trainee Id:"+tId);
		System.out.println("Trainee Name:"+tName);
		System.out.println("technology :" +technology);
		// System.out.println("stipend:"+salary);
	}	
	
	}
public class TestTrainee {

	public static void main(String[] args) {
		Trainee t1=new Trainee(); //creating object for trainee class
		Trainee t2=new Trainee();
		
		
		t2.input();
		
		t1.input(); 
		
	//method call it has objects in main class
		float s1=t1.calculate();
		float s2=t2.calculate();
		t1.display();
		System.out.println("stipend  "+s1);
		t2.display();
		System.out.println("stipend  :"+s2);
       
	}

}
