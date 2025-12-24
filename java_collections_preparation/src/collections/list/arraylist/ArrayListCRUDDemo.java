package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCRUDDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		// Add 5 elements 
		list.add(7);
		list.add(17);
		list.add(23);
		list.add(31);
		list.add(11);
		
		// Print the list
		System.out.println(list);
	
		// get the element at index 2 here it would be 23
		System.out.println(list.get(2));
		
		// Update the element at index  1
		list.set(1, 13);
		System.out.println(list.get(1)); //give 13 now
		
		// Remove element at 3
		list.remove(3); // this references to 31 so now you wont see 31 in list
		System.out.println(list);
		
		// Print size 
		System.out.println(list.size());
		
		
		// Final list after modifications
		System.out.println(list);
		
		
	}
}
