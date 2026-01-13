package collections.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		/* Implementing Queue from LinkedList , queue follows FIFO
		 * elements are added at the end and removed from start  
		 */
		
		List<Integer> listAsQueue = new LinkedList<>();
		listAsQueue.addLast(1);  // This Operation is enqueue
		listAsQueue.addLast(2);
		listAsQueue.addLast(3);
		listAsQueue.addLast(4);
		
		listAsQueue.removeFirst(); // This operation is dequeue 
		
//		System.out.println(listAsQueue);
//		
//		System.out.println(listAsQueue.getFirst()); // This acts as peek 
		
		
		
		// now lets see from Queue 
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);  //  enqueue
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		queue.remove (); //  dequeue 
		
//		System.out.println(queue);
//		
//	System.out.println(queue.peek()); //  peek 

		
		Queue<Integer> list = new LinkedList<>();
		
		System.out.println(list.size());
		//System.out.println(list.remove()); // when Queue is empty it throws exception 
		System.out.println(list.poll()); // Poll acts same as remove but does not throw exception instead gives null
		
		//System.out.println(list.element()); // when Queue is empty it throws exception  , elements acts same as peek 
		System.out.println(list.peek()); // gives null when empty or first element 
		
		
		
		// To understand add and offer lets make ArrayBlockingQueue that way we can give capacity 
		Queue<Integer> list2 = new ArrayBlockingQueue<Integer>(2);
		
		list2.add(1);
		list2.offer(2);
//		list2.add(3); // This throws exception Queue full 
		list2.offer(3);  // this does not 
		System.out.println(list2);
	}

}
