package com.collections.java;


import java.util.PriorityQueue;

public class PriorityQueueExp {
	
	void meth1() {
		System.out.println("Implementing the Priority Queue");
		
		PriorityQueue<Object> pq = new PriorityQueue<Object>(); //creates a priority queue with a default size as 11
		pq.add(10);
		pq.offer(44); //offer() method is used to insert a particular element into the Priority Queue. 
		//It acts similar to the add() method of Priority Queue. 
		//pq.offer(null); //nulls are not accepted
		//pq.offer(10); //no duplicates
		//pq.offer("Java");does not accept string as the first element here is an Integer. It takes only the integer values even though we did not declare the Queue as an Integer type
		pq.offer(25);
		//pq.offer("Apple");
		pq.offer(27);
		pq.offer(78);
		
		
		
		System.out.println(pq);
		
			
		System.out.println(pq.poll()); //retrieves and removes the smallest element from the priority queue 
		//10 is removed here
		System.out.println(pq.peek()); //retrieves but does not remove the smallest element from the priority queue.
		System.out.println(pq.element());//is similar to peek(), retrieving but not removing the smallest element from the priority queue.
		
		System.out.println(pq);
		
	}
	
	public static void main(String[] args) {
		PriorityQueueExp exp = new PriorityQueueExp();
		exp.meth1();
		
	}
	

}
