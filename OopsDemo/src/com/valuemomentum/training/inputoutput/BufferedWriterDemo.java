package com.valuemomentum.training.inputoutput;

import java.io.FileWriter;
import java.io.FileWriter.*;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.Writer;
public class BufferedWriterDemo{ 
	public BufferedWriterDemo(FileWriter writer) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) { 

		// Writing to a file using BufferedWriter in Java 

		try { 
			FileWriter writer = new FileWriter("c:/Test/hello2.txt",true); 
			BufferedWriterDemo bwr = new BufferedWriterDemo(writer);  //creating a writer object in append mode

			bwr.write("James"); 
		    bwr.write("\n"); // bwr.newLine();
			bwr.write("Hobert"); 
			//bwr.clone(); 

			System.out.println("succesfully written to a file");
		} 
		catch (IOException ioe)
		{ 
			ioe.printStackTrace(); 

		}
	}

	private void write(String string) {
		// TODO Auto-generated method stub
		
	}
}

	