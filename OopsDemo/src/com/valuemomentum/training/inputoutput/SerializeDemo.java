package com.valuemomentum.training.inputoutput;
import java.io.*;
public class SerializeDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e=new Employee();
		
		e.name="hameeda";
		e.address="SPM,Sec";
		e.SSN=999999999;
		e.number=99;
		try
		{
			FileOutputStream fileOut=new FileOutputStream("c:/Demo/Employee.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serilalized data is saved in c:/Demo/Employee.ser");
		}
		catch(IOException i)
		{
		i.printStackTrace();	
		}
	}
}

