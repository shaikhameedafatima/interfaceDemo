package com.valuemomentum.training.inputoutput;
import java.io.*;
public class Persist {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"raj");
	FileOutputStream fout=new FileOutputStream("c:/Test/hello.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(s1);
	out.flush();
	System.out.println("success");
	}

}
