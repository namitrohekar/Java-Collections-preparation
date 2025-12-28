package collections.list.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBasics {
	
	public static void main(String[] args) {
		
		
		List<Integer>  list = new LinkedList<Integer>();
		
		list.add(79);
		list.add(67);
		list.add(111);
		list.add(47);
		
		System.out.println(list.get(2)); // O(n) has to traverse to find element
		
		// adding element at first and last 
		list.addFirst(1); // O(1)
		list.addLast(997); // O(1)
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println(list);
		
		
		
		// remove can be done like first , last , or index
//		
//		list.remove(3);
//		list.remove(Integer.valueOf(47));
//		list.removeFirst();
//		list.removeLast();
//		
//		System.out.println(list);
		
		
		list.removeIf(x -> x % 2 == 0);
		System.out.println(list);
		
//		for( Integer l : list ) {
//			System.out.println(l);
//		}
		
		
		
		// Making linked list on the fly 
		
		
		List<String> animals = new LinkedList<>(Arrays.asList("Hippo" , "T-rex" , "Mamoth" , "Dragon"));
		
		System.out.println(animals);
	}

}
