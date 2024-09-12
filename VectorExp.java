package com.collections.java;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;


public class VectorExp {
	
	void meth1() {
		Vector <Object> v=new Vector <Object>();
		v.add(10);
		v.add('A');
		v.add(20);
		v.add("Java");
		v.add(200);
		v.add("abc");
		v.add(true);
		v.add('x');
		v.add(90);
		v.add(55);
		
		System.out.println("\nFor loop:");
		
		for(int i=0;i<=v.size()-1;i++) {
			System.out.println(v.get(i));
			
		}
		
		System.out.println("\nreverse");
		
		for(int i=0;i>v.size()-1;i--) {
			System.out.println(v.get(i));
		}
		
		System.out.println("\n\nFor each loop:");
		
		for(Object o:v) {
			System.out.println(o);
			
		}
		
		System.out.println("\nUsing Iterator");
		
		Iterator <Object> i=v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+" ");
		}
		
		System.out.println("\n\nEnumeration");
		Enumeration <Object> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement()+" ");
			
		}
		System.out.println("\n------Using ArrayList-------");
		ArrayList<Object> al1 = new ArrayList<Object> (v);
		System.out.println("\n"+al1);
		
		ArrayList <Object> al2=new ArrayList<Object> (v);
		al2.add(13);
		al2.add(false);
		v.addAll(al2);
		System.out.println(v);
		
		ArrayList al3=new ArrayList<Object> (v);
		System.out.println("\n\nBefore al3:" +al3);
		al3.retainAll(al2);
		System.out.println("\n\nAfter al3:" +al3);
		
	}
	
	void meth2() {
		System.out.println("\n\nmethod 2 called");
		int arr[]  = {10,20,30,40,50};
		Vector<Object> v2=new Vector<Object>();
		for(int i : arr) {
			v2.add(i);
		}
		System.out.println(v2);
		System.out.println("\nCapacity: " +v2.capacity());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter 6 numbers");
		for(int i=1; i<=6;i++) {
			v2.add(sc.nextInt());
		}
		
		sc.close();
		System.out.println("\n"+v2);
		System.out.println("\nCapacity():" +v2.capacity());
	}
	

	
	public static void main(String[] args) {
		VectorExp vect=new VectorExp();
		vect.meth1();
		vect.meth2();
		
	}

}
