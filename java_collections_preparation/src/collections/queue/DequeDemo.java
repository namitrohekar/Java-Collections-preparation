package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		
		/* Double-ended Queue
		 * allows Insertion and removal of elements from both ends 
		 * versatile than regular queues and stacks because they support all the operations of both 
		 *  
		 */
		
		Deque<Integer> deque1 = new ArrayDeque<Integer>(); // Faster Iteration , low memory , no null allowed 
		// Circular array , head and tail , no need to shift elements just shift head and tails 
		
		deque1.addFirst(10); // head -- 
		deque1.addLast(20); // tail ++
		deque1.offerFirst(5);
		deque1.offerLast(25);
		
		System.out.println("First Element : " + deque1.getFirst());
		System.out.println("Last  Element : " + deque1.getLast());
		
		System.out.println(deque1.pollLast());
		
		Deque<Integer> deque2 = new LinkedList<Integer>(); // Insertion , Deletion somewhere in middle 
	}
}
