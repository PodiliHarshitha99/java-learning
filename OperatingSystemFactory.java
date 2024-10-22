package com.prct.factorydesignpattern.OS;

public class OperatingSystemFactory 
{
	//defining type of OS
	public OS getInstance(String str)  
	{
		if (str.equals("Samsung")) {
			return new AndroidOS();
		}
		else if(str.equals("Iphone")) {
			return new IOS();
		}
		else if (str.equals("Microsoft Lumia")) {
			return new WindowsOS();
			
		}
		return new LinuxOS();
	}
	
	
}


