package com.nt.oop;

public abstract class  AbstractionParentClassDemo {
	
	abstract void meth1();
		abstract void meth1(String s);
		void meth2() {
			System.out.println("meth2() from the ParentClass is called(non-abstract method)");
	}
		static void meth3() {
			System.out.println("Static method 3 is called");
		}
		
		AbstractionParentClassDemo(){
			System.out.println("Abstract class constructor is called");
		}
		
		public static void main(String[] args) {
			System.out.println("ParentClass main method is called");
			
			//AbstractionParentClassDemo apc = new AbstractionParentClassDemo(); --> we are getting error because we cannot instantiate an abstract class (creating an object for the class)
			AbstractionParentClassDemo.meth3();
		}

}
