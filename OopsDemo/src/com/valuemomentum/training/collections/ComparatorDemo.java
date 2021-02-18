package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Student2> ar=new ArrayList<Student2>();
		
		Student2 s1=new Student2(111,"John","Bengaluru");
		Student2 s2=new Student2(121,"Allan","Mumbai");
		Student2 s3=new Student2(101,"Mike","Newyork");
		Student2 s4=new Student2(115,"Sam","Milan");
		
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		
		System.out.println("**********Unsorted Array List:************");
		//System.out.println(ar); // invoke toString() method
		for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
		
		Collections.sort(ar, new SortByRoll());
		
		System.out.println("**********Sorted Array List by Roll No:**********");
				for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

		Collections.sort(ar, new SortByName());
		System.out.println("**********Sorted Array List by Name:**************");
		for (int i=0; i<ar.size(); i++)
    System.out.println(ar.get(i));
	}

}
