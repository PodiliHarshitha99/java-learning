package com.nt.oop;
import java.util.Scanner;
public class EncapsulationEmpTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EncapsulationEmpDemo emp = new EncapsulationEmpDemo();
		
		System.out.println("enter employee ID:");
		int EmpId = sc.nextInt();
		emp.setEmpId(EmpId);
		sc.nextLine();
		
		System.out.println("enter employee Name:");
		String Name = sc.nextLine();
		emp.setName(Name);
		
		System.out.println("enter employee department name:");
		String Dept = sc.nextLine();
		emp.setDept(Dept);
	
		System.out.println("ID:" +emp.getEmpId());
		System.out.println("Name:" +emp.getName());
		System.out.println("Department:" +emp.getDept());
		
		
		sc.close();
	
	}
	

}
