package com.valuemomentum.training.inputoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Writer w=new FileWriter("c:/Test/hello2.txt");
			String content="she sells  sea shells";
			w.write(content);
			w.close();
			System.out.println("data written");
				
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
