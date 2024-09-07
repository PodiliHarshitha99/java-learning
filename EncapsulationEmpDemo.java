package com.nt.oop;



//Encapsulation refers to integrating data (variables) and code (methods) into a single unit. 
//The class's variables are hidden from other classes and can only be accessed by the methods of the class which they are found. 

public class EncapsulationEmpDemo {
	private int empId;
	private String name;
	private String Dept;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}

}
