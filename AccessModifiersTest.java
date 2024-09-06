package com.nt.coreJava;

public class AccessModifiersTest {	    
	public static void main(String[] args) {
    AccessModifiersDemo demo = new AccessModifiersDemo();
    
    // Accessing fields and methods from the Demo class

    System.out.println("Accessing fields from outside the class(DEMO class):");
    System.out.println("Public Field: " + demo.a); //public field
    System.out.println("Protected Field: " + demo.b); // Works only if this file is in the same package
    System.out.println("Default Field: " + demo.c); // Works only if this file is in the same package

    demo.publicMethod();
    demo.protectedMethod(); 
    demo.defaultMethod(); 
    //demo.privateMethod(); // Compilation error: privateMethod() has private access in only AccessModifiersDemo class
		}



	}


