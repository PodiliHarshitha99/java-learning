package com.collections.java;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListexmp {
	
	void meth1() {
		System.out.println("Implementing ArrayList");
		
		ArrayList<Integer> al = new ArrayList<Integer> ();
		al.add(10);
		al.add(8);
		al.add(7);
		al.add(11);
		al.add(8);
		al.add(5);
		al.add(null);
		al.add(99);
		System.out.println("\n al:" +al);
		System.out.println("\n size():" +al.size());
		System.out.println("\n get():" +al.get(5));
		System.out.println("\n get():" +al.get(al.size()-1));
		System.out.println("\n\n Retrieving the data by using for-loop");
		
		
	for(int i=0;i<al.size(); i++) {
			
			System.out.println(al.get(i));
			
		}
	System.out.println("\n\n Retrieving data by using for-each");
	
	for(Integer t:al) {
		System.out.println(al.get(t));
		
	}
	
	System.out.println("\n\n Retreiving by using iterator");
	Iterator <Integer> i = al.iterator(); //iterator is an interface that is used to retrieve the data in forward direction
	while(i.hasNext()) {
		
		System.out.println(i.next() +" ");
	}
		System.out.println("\n\n---method()-----");
		System.out.println("isEmpty()" +al.isEmpty());
		System.out.println("al:" +al);
		//al.clear();
		System.out.println("contains()" +al.contains(20));
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(8);
		
		System.out.println("Contains all():"+al.containsAll(al2));
		al.addAll(al2);
		
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayListexmp aobj=new ArrayListexmp();
		aobj.meth1();
	}
}
