package com.valuemomentum.training.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(111, "john");
hm.put(222,"jim");
hm.put(333,"mike");
for(Entry m:hm.entrySet())
		{
	System.out.println(hm);
		}
	}

}
