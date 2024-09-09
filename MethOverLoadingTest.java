package com.nt.oop;

public class MethOverLoadingTest {
	
	public static void main(String[] args) {
		
		System.out.println("Method1 in parent class:"+MethOverLoadingDemo.Multiply(10, 30)); //method 1 in Parent class
		System.out.println("Method2 in Child class:" +MethOverLoadingDemo.Multiply(30.56, 0.23));
	}

}
