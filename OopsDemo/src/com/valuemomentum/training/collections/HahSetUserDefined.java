package com.valuemomentum.training.collections;

import java.util.HashSet;
import java.util.Set;

public class HahSetUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> empset=new HashSet<Employee>();
		Employee e1=new Employee(100,"john",5000);
		Employee e2=new Employee(101,"joh",6000);
		Employee e3=new Employee(102,"johnt",7000);
		Employee e4=new Employee(103,"johnen",8000);

		empset.add(e1);
		empset.add(e2);
		empset.add(e3);
		empset.add(e4);
		for(Employee e:empset)
		{
			System.out.println(e.id+""+e.name+""+e.sal);
			
		}
	}

}
