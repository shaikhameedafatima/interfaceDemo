package com.valuemomentum.training.bookbasement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	static Connection con;
	
	
	public static Connection getConnection()
	{
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mysqljdbc","root","redhat");
			System.out.println("Connected to Database");
			return con;
		}
		 catch(Exception e){ 
				
				System.out.println(e);
				return null;
				}  		
			 
	}
}