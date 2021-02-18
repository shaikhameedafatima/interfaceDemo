package com.valuemomentum.training.inputoutput;
import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class FileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("c:/hello2.txt");
		try
		{
			if(f.createNewFile())
			{
				System.out.println("new file created!");

			}
			else
			{
				System.out.println("the file already exists:");

			}
		}


		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("name of the file:" +f.getName());
		System.out.println("path of the file:" +f.getPath());
		System.out.println("date of the modified file:" +new Date(f.lastModified()));
		System.out.println("parent folder of the file:" +f.getParent());
	}
}


