package com.nt.oop;

public class InheritSum extends InheritParentClass {
	
	public static void main(String[] args) {
		
		InheritParentClass ipc = new InheritParentClass();
		int a =  300;
		System.out.println("Using Parent class properties:" + (a * ipc.Addition(1000, 2000)));
	}

}
