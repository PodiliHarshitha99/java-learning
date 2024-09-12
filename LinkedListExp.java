package com.collections.java;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExp {
	
	void meth1() {
		LinkedList<Object> L =new LinkedList<Object>();
		L.add('A');
		L.add(10);
		L.add("Java");
		L.add(true);
		L.add(null);
		L.add(77);
		L.add(10);
		L.add(1);
		
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
