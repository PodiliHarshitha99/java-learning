package com.prct.factorydesignpattern.main;

//import com.prct.factorydesignpattern.OS.IOS;
import com.prct.factorydesignpattern.OS.OS;
import com.prct.factorydesignpattern.OS.OperatingSystemFactory;

public class FactoryDesignMain {
	
	public static void main(String[] args) {
		
		//OS obj = new IOS(); 
		//Here we are creating an object for OS interface and calling the IOS class that implements the interface
		
		/*But we are providing the implementation as "new IOS()". If we want to change it from IOS to Windows, we need to changes this code re-compile it.
		The client know what are the classes that we are using by exposing class keyword. 
		Instead of creating directly an object, we can create another class and create all the class objects of the OS Interface. 
		OperatingSystemFactory is the class that holds the class objects of OS interface (AndroidOS, IOS, LinuxOS, WindowsOS). 
		*/
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("Samsung");
		obj.specification();
		
		OS obj2 = osf.getInstance("Iphone");
		obj2.specification();
		
		OS obj3 = osf.getInstance("Microsoft Lumia");
		obj3.specification();
		
		OS obj4 = osf.getInstance("Linux");
		obj4.specification();

		//we are using Factory object which manufactures objects and OperatingSystemFactory is a class that gives us the object.
		//Even if we have extra class in future, it will not change the client application. It will change only the OperatingSystemFactory class, but not the client application. 
		
		
	}

}
