package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComaparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(111,"john",29));
		al.add(new Student(222,"Mike",25));
		al.add(new Student(555,"mary",26));
		
		
		Collections.sort(al);
		//Collections.reverse(al);
		
		for(Student st:al) {
		
		System.out.println(st.rollno+" "+st.name+""+st.age);
	}}

}
