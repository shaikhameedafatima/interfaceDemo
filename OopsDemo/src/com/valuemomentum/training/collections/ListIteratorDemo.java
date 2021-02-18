package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
 ArrayList<String> al=new ArrayList<String>();
 al.add("jim");
 al.add("jet");
 al.add("jit");
 al.add(1,"jutr");
 
 System.out.println("element aat 2nd position:" + al.get(2));
		ListIterator<String> itr=al.listIterator();
		System.out.println("traversing elemnets in forward direction");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("travversing elements in backward direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
			
		}
	}

}
