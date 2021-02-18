package com.valuemomentum.training.inputoutput;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Reader reader=new FileReader("c:/Test/hello2.txt");
			int data=reader.read();//returns unicodevalue of character
			while(data!=-1)
			{//-1 when stream ends
				System.out.print((char)data);
			data=reader.read();
			}
		reader.close();
		
	
		}catch(Exception e)
	{
		System.out.println(e.getMessage());
		// TODO Auto-generated method stub
	}
}

}