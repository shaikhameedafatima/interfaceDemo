package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Book> list=new ArrayList<Book>();
		// creating Books
	
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		
		
		//adding books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		//traversing list
		for(Book b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" " +b.quantity+" ");
		}
		

	}

}
