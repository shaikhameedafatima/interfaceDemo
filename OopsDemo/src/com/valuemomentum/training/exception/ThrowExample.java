package com.valuemomentum.training.exception;

public class ThrowExample {
	static void checkEligibility(int stuage,int stuweight)
	{
		if(stuage<12 && stuweight<40)
		{
			throw new ArithmeticException("student is not eligible for registration");
		}
		else
		{
			System.out.println("student entry is valid");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to registration process");
		checkEligibility(12,39);
		System.out.println("have a nice day");
	}

}
