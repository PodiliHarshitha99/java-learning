package examples;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Collections;
//import java.util.List;

public class Solution {
	
	
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
////ArrayList<Boolean> list = new ArrayList<>();
//
//ArrayList<Integer> list2 = new ArrayList<>();
//list2.add();
//
////int extraCandies;
//
//for(int i : list2) {
//i=Collections.max(list2);
//System.out.println(i);







	/*public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
// Creating kidsWithCandies method that takes integer array as 1st parameter and another integer as a 2nd parameter. 
//It returns a list of boolean values 
	
		ArrayList<Boolean> list = new ArrayList<>();
		
		
		
		return list;
		
	*/
	
		
		
		
	/*	
		
		int max = 0;
		for(int i : candies) {
			if (i>max) {
				max=i;
			}
		}
		for(int i : candies) {
			
			list.add(i + extraCandies >= max);
			
					
		}
				
		
        return list;
    }
    */

  
    	
    	
        
    	
    	/*Solution solution = new Solution();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
        */ 
  


