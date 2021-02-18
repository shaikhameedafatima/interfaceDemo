package com.valuemomentum.training.exception;

public class ThrowDemo {
	public static void hello(int a)
	{
		if(a==0)
		throw new ArithmeticException("Testing");
		else
			System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello(0);
	}

}
