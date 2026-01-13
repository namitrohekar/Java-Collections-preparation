package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		/*
		 * Part of queue interface 
		 * orders elements based on their natural ordering( for primitives lowest first)
		 * custom comparator for customized ordering
		 * does not allow null elements 
		 */
		
		Queue<Integer> pq = new PriorityQueue<Integer>(( a , b) -> b - a );
		
		// To understand the priority , if not specified then  natural ordering lets add some element and then remove them 
		
		pq.add(22);
		pq.add(34);
		pq.add(77);
		pq.add(2);
		pq.add(5);
		pq.add(6);
		pq.add(10);
		pq.add(19);
		
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
		System.out.println(pq.poll());
		System.out.println(pq);
			
		}
		
		
		
		// Internal working   
		// Priority queue is implemented as a min-heap by default (For natural Ordering )
		
		
		
	}
}
