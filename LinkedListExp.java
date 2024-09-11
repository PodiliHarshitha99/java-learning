package com.collections.java;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExp {
	
	void meth1() {
		LinkedList<Object> L =new LinkedList<Object>();
		L.add('A');//Insertion order is maintained
		L.add(10);//Heterogeneous data is allowed
		L.add("Java");//NULL is allowed
		L.add(true);//Available for Java 1.2v
		L.add(null);//default capacity is 0
		L.add(77);//size increases by DOUBLE
		L.add(10);//Duplicates are allowed
		L.add(1);//not synchronized
		
		System.out.println(L);
		
		System.out.println("\nPrinting the data in reverse order");
		for (int i=L.size()-1; i>0; i--) {
			System.out.println(L.get(i)+ " ");
			Object arr[] = new Object[6];
			int k=0;
			System.out.println("\n");
			for (i=L.size()-2;i>=1;i--) {
				arr[k++] = L.get(i);
			}
			
			System.out.println("\nRetrieving data from array by using for-each");
			for(Object o:arr) {
				System.out.println(o+" ");
				
			}
			System.out.println("\n----------");
			System.out.println("\nRetrieving data by using List Iterator");
			ListIterator<Object> L2 = L.listIterator();
			while(L2.hasNext()) {
				System.out.println(L2.next());
			}
			
			
			
		}
		
		
	}

}
