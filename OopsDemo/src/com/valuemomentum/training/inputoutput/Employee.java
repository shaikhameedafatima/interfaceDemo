package com.valuemomentum.training.inputoutput;

public class Employee {
	 String name;
	 String address;
	 transient int SSN;
	 int number;
	 public void mailCheck()
	 {
		 System.out.println("mailing a check to"+name+" "+address);
	 }

	
	

}
