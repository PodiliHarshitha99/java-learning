package com.nt.oop;

public class InheritChildClass extends InheritParentClass {
	
	void method2() {
		System.out.println("Child Class");
		
	}
	
	public static void main(String[] args) {

			
		InheritParentClass ipc = new InheritParentClass();
		ipc.method1();
		ipc.Addition(10000000, 2000000);
		ipc.Subtraction(10000, 30000);
	
		
		
		
		System.out.println("Inheritance implemented");
	}

}
