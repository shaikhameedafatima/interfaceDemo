package com.valuemomentum.training.exception;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("jamesgosling");//default length is 16 and jamesGosling is 12
		int l=str.length();
		//StringBuffer str=new StringBuffer(50);
		//System.out.println("the length of string:"+str);
		//System.out.println("the capacityof string"+str.capacity());//28-12=16

		//System.out.println("the reverse of string"+str.reverse());
	//System.out.println("the substring of string"+str.substring(0,4));//returns string from 0 to n-1
	str.replace(5, 10, "jamesgosling");
	System.out.println(str);
	
	
	
	}
	
	
	

}
