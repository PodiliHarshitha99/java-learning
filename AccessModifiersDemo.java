package com.nt.coreJava;

public class AccessModifiersDemo {	 // Public class which can be accessed from anywhere
	
	   
	    public int a = 1; // Public -- Accessible from anywhere

	    
	    protected int b = 2;  //protected -- Accessible within the same package and subclasses

	   
	    int c = 3;  // Default (package-private) field -- Accessible only within the same package

	    
	    private int d = 4; // Private field -- Accessible only within this class

	    // Public method
	    public void publicMethod() {
	        System.out.println("Public Method");
	    }

	    // Protected method
	    protected void protectedMethod() {
	        System.out.println("Protected Method");
	    }

	    // Default (package-private) method
	    void defaultMethod() {
	        System.out.println("Default Method");
	    }

	    // Private method
	    private void privateMethod() {
	        System.out.println("Private Method");
	    }

	    
	    public void demonstrateAccess() {
	        System.out.println("Accessing fields and methods from within the class:");
	        System.out.println("Public Field: " + a);
	        System.out.println("Protected Field: " + b);
	        System.out.println("Default Field: " + c);
	        System.out.println("Private Field: " + d);
	        
	        publicMethod();
	        protectedMethod();
	        defaultMethod();
	        privateMethod();
	    }
	}

	

	


