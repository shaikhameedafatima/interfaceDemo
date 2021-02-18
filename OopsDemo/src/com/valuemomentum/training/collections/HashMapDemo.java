package com.valuemomentum.training.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
	 HashMap<Integer,String> languages=new HashMap<>();
	 languages.put(1,"java");
	 languages.put(2,"python");
	 languages.put(3,"javascript");
	 System.out.println("hashmap:"+languages);
	 //get() method to get values
	 String value=languages.get(1);

	 System.out.println("value at index 1:"+value);
	 System.out.println("value at index 1:"+languages.get(3));
	 // return set view of keys 
	 System.out.println("keys:"+languages.keySet());
	 //return set of values
	 System.out.println("values:"+languages.values());
	 //return set view of key/value pairs
	 System.out.println("key/value mappings"+languages.entrySet());
     languages.replace(2, "c++");
     //iterate through keys only
     System.out.println("keys:");
     for(Integer key:languages.keySet())
     {
    	 System.out.println(key +" -"+languages.get(key));
    	 System.out.println(",");
     }
     // iterate through key/value entries
     System.out.print("\nEntries: ");
     for (Entry<Integer, String> entry : languages.entrySet()) {
       System.out.print(entry);
       System.out.print(", ");
     }
	
	}

}
