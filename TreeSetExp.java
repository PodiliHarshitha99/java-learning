package com.collections.java;

import java.util.TreeSet;




public class TreeSetExp {
	
	    public static void main(String[] args) {
	        
	    	TreeSet<Integer> set = new TreeSet<>(); //Creating tree set of Integer type

	       
	        set.add(10);
	        set.add(80);
	        set.add(5);
	        set.add(15);
	        set.add(25);
	        //set.add(null); NonNull exception
	         

	      
	        System.out.println("set: " +set);

	        System.out.println("Contains 15? " + set.contains(15));
	        System.out.println("Contains 30? " + set.contains(30));

	   
	        set.remove(25);
	        System.out.println(set);

	        System.out.println("First element: " + set.first());
	        System.out.println("Last element: " + set.last());

	        System.out.println(set.headSet(20)); //headset is a method that returns a portion of tree set less than 20. Provides the subset of the tree set.
	        
	        
	        System.out.println("TailSet: " + set.tailSet(15)); // tailSet method provides a set greater than or equal to 15
	        
	        
	        System.out.println("SubSet (between 5 and 20): " + set.subSet(5, 20)); //subSet method provides a set between 5 and 20
	        

	        set.clear();
	        System.out.println(set);
	    }
	}



