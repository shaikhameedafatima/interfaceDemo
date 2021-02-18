package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<String>();//creating araylist
		al.add("Jim");
		al.add("Jam");
		al.add("Jan");
		al.add("Jet");
		//traversing elements using iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(al.get(1));
		al.add(3,"raj");
		
		al.remove(0);
		System.out.println("***display using for loop");
		
	}


	}


