package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	
	public static void main(String[] args) {
		
		Map<String, Integer> shoppingList = new LinkedHashMap<>(11 , 0.3f, true);  // has Doubly linked list that keeps insertion order 
		
		
		/*
		 * The constructor has 3 parameters:
		 * 1. initialCapacity -initial size of the internal hash table
		 * 2. loadFactor - decides when resizing happens (resize when size > capacity × loadFactor)
		 * 3. accessOrder - false by default (insertion order is maintained)
		 *    if true, order is based on access; whenever an element is accessed,
		 *    it moves to the end and becomes the most recently used
		 *    (useful for cache eviction strategies like LRU)
		 */

		
		
		shoppingList.put("Mango", 20);
		shoppingList.put("Apple", 30);
		shoppingList.put("Bannana", 11);
		shoppingList.put("Grapes", 15);
		
		
		// getting to show accessOrder Demo 
		shoppingList.get("Bannana");
		shoppingList.get("Bannana");
		shoppingList.get("Apple");
		shoppingList.get("Bannana");
		shoppingList.get("Apple");
		shoppingList.get("Grapes");
		

		
		for(Map.Entry<String , Integer> entry : shoppingList.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
		
		// similar methods of all map work here too not repeating CRUD operations 
		
		
		
		
		
	}
}
