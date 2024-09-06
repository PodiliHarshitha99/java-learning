package com.nt.coreJava;

public class Variables {
	
	int x = 10; 
	static int y = 20; 
	int a;
	static boolean flag;
	
	void meth1() {
		int z = 0;
		System.out.println("Instance variable:" +x);
		System.out.println("Instance variable" +new Variables().x);
		System.out.println("\nStatic variable y:" +y);
		System.out.println("static variable y:" +new Variables().y);
		System.out.println("Static variable y:" +Variables.y);
	}
	
	void meth2() {
		int x = 100;
		int y=200;
		int z = 200;
		
		System.out.println("method 2 called");
		System.out.println("Instance variable:" +new Variables().x);
		//System.out.println("Static variable y:" Variables.y);
		System.out.println("Local variables:"+x +"\ny:"+y +"\nz:"+z );
	}
	
	void meth3() {
		System.out.println("mehtod 3 called");
		int c;
		System.out.println("Instance variables:" +a);
		System.out.println("Static variables:" +flag);
		//System.out.println("Local variable:"+c); // Compile time error
		
		
	}
	
	public static void main(String[] args) {
		Variables aobj = new Variables();
		aobj.meth1();
		System.out.println("------------------------");
		aobj.meth2();
		System.out.println("-------------------------");
		aobj.meth3();
	}
}

