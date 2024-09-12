package com.collections.java;
import java.util.LinkedHashSet;
import java.util.Iterator;


public class LinkedHashSetExp {
		
	    public static void main(String[] args) {
	        
	        LinkedHashSet<Object> set = new LinkedHashSet<>(); // Creating LinkedHashSet


	        set.add("abc");
	        set.add(1234);
	        set.add(true);
	        set.add(null);
	        set.add("java");
	        
	        System.out.println(set);

	        System.out.println("set contain 'Banana'? " + set.contains("Banana"));

	        set.remove("abc");
	        System.out.println("Set after removing" +set);

	        System.out.println(set.size());

	        // Iterate over the set
	        System.out.println("Iterating over the set:");
	        Iterator<Object> iterator = set.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	        set.clear();
	        System.out.println(set);
	    }
	}


