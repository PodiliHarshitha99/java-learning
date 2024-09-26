package examples;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Collections;
//import java.util.List;

public class ObjectTypeToPrimitiveType {
		
	  public static void main(String[] args) {
		  
		  ArrayList<Object> list = new ArrayList<Object>();
		  list.add(10);
		  list.add("Java");
		  list.add(true);
		  list.add("abc");
		  list.add(100);
		  list.add(80);
		  list.add(1000);
		  list.add("xyz");
		  list.add(false);
		  
		  System.out.println("Object type ArrayList: " +list);
		  
		  ArrayList<Integer> num_list = new ArrayList<Integer>();
		  for (Object obj : list) {
			  if (obj instanceof Integer) {
				  num_list.add((Integer)obj);
			
		}
	}
	
		  System.out.println("Integer type Array list: " +num_list);
		  
		  
		  ArrayList<String> string_list = new ArrayList<String>();
		  for (Object obj: list) {
			  if (obj instanceof String) {
				  string_list.add((String)obj);
			  }
		  }
		  
		  System.out.println("String type arraylist: " +string_list);
		  
		  ArrayList<Boolean> bool_list = new ArrayList<Boolean>();
		  for(Object obj:list) {
			  if(obj instanceof Boolean) {
				  bool_list.add((Boolean)obj);
			  }
		  }
		  
		  System.out.println("Boolean type array list: " +bool_list);
	  }
	}
