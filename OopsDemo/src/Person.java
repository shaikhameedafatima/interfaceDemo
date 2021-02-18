import java.util.Scanner;
public class Person
{
    private String name;
    private int age;
    private String constituency;
    Scanner s;
    
    public void input()
    {
        System.out.println("Enter your Name: ");
        name=s.next();
        System.out.println("Enter your age: ");
        age=s.nextInt();    
    }
    
    public void print()
    {
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
        System.out.println("Constituency  is:"+constituency);
    }
    
    Person()
    {
        System.out.println("Voter Eligibility App");
        age=0;
        name="";
        constituency="Hyderabad";
        s=new Scanner(System.in);
    }
    
    Person(String n,int a)
    {
        System.out.println("Voter Eligibility App");
        name=n;
        age=a;
        constituency="Hyderabad";
    }
    
    Person(String n,int a,String c) // parameterized constructor
      {
       name=n;
       age=a;
       constituency=c;
    }
}
   

