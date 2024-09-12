package com.collections.java;
import java.util.HashSet;

public class HashSetExp<object> {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		
		set.add("Harshitha");
		set.add("Apple");
		set.add("xyz");
		set.add("abc");
		//set.add(); null is not accepted
		
		System.out.println("Hash set elements:" +set); //no specific order
		
		boolean elementHarshitha = set.contains("Harshitha"); 
		System.out.println(elementHarshitha);
		
		set.remove("xyz");
		System.out.println("element deleted" +set);
		
		int setSize = set.size();
		System.out.println(setSize);
		
		set.clear();
		System.out.println(set);
		
		
	}
	
		
		
		
	}

