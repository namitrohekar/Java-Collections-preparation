package collections.list.vector;

import java.util.ArrayList;
import java.util.Vector;

public class SynchronousDemo   {

	public static void main(String[] args)   {
		
		// first lets do Arraylist then comment it and observe synchronous behavior with vector
	//	ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		Vector<Integer> list = new Vector<Integer>();
		
		Thread t1 = new Thread(() -> {
			
			for(int i = 0 ; i < 1000; i ++) {
				list.add(i);
			}
		});
		Thread t2 = new Thread(() -> {
			
			for(int i = 0 ; i < 1000; i ++) {
				list.add(i);
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("Size of the list  "+ list.size()); // expected OutPut: 2000
		
	}
}
