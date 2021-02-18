package com.valuemomentum.training.inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist {
	public static void main(String[] args) throws Exception, IOException
	{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:/Test/rest.ser"));
		Student s=(Student)in.readObject();
		System.out.println(s.id+" "+s.name);
		in.close();
	}

}
