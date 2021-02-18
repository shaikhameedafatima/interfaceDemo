package com.valuemomentum.training.collections;

import java.util.Comparator;

public class Student2 {
		int rollno;
		String name,address;
		
		public Student2(int rollno, String name, String address) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.address = address;
		}
// used to print student properties in main when obj is given in sop
		@Override
		public String toString() {
			return "Student2 [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
		}		
}
class SortByRoll implements Comparator<Student2>
{

	@Override
	public int compare(Student2 s1, Student2 s2) {
		// TODO Auto-generated method stub
		return s1.rollno-s2.rollno;
	}
	
}
class SortByName implements Comparator<Student2>
{

	@Override
	public int compare(Student2 s1, Student2 s2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}