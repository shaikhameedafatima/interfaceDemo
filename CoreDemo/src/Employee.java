import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
	    int eid,sal,net;
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the eid");
	    eid=s.nextInt();
	    System.out.println("enter the salary of the employee");
	    sal=s.nextInt();
	    System.out.println("enter the basic salary");
	    int bas=s.nextInt();
	    System.out.println("enter the HHRA");
	    int hra=s.nextInt();
	    System.out.println("enter the DA");
	    int DA=s.nextInt();
	    System.out.println("enter the pf");
	    int pf=s.nextInt();
	    net=((bas+hra+DA)-pf);
	    System.out.println("the salaary net is "+net);
	    
	    
	    
	    
	}

}
