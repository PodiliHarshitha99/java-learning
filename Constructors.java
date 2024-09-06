package com.practice.java;

public class Constructors {
	
	void meth1()
	{
		System.out.println("meth1() called");
		new Constructors();
	}
	
	Constructors()
	{
		System.out.println("non-parameterized constructor");
	}
	
	Constructors(int x)
	{
		System.out.println("parameterized constructor:" +x);
	}
	
	public static void main(String[] args)
	{
		Constructors ctr=new Constructors();
		ctr.meth1();
		new Constructors();
		new Constructors(200);
	}

}

/*
 * exp - output:
 * non-parameterized constructor
 * meth1() called
 * non-parameterized constructor
 * non-parameterized constructor
 * parameterized constructor: 200
*/