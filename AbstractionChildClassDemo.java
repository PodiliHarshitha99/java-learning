package com.nt.oop;

public  class  AbstractionChildClassDemo extends AbstractionParentClassDemo {
	
	@Override
	void meth1() {
		System.out.println("Abstract method overriden");
		
	}
	
	void meth1(String msg) {
		System.out.println("Java is:"+msg);
	}
		
	
	public static void main(String[] args) {
		AbstractionParentClassDemo acc = new AbstractionChildClassDemo();
		 acc.meth1();
		 acc.meth1("awesome");
		 acc.meth2();
	}
	

}
