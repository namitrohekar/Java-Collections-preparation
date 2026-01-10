package collections.map;

import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		
		/*
		 * HashTable is a legacy class existed before collections 
		 * we don't use it now concurrent hash-map is better choice 
		 * it is synchronous   
		 * neither key or value can be null 
		 * only linked list in case of collision  
		 */
		
		
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		
		
		hashtable.put(1, "Namit");
		hashtable.put(2, "Marcus");
		hashtable.put(3, "Julius");
		hashtable.put(4, "Agustus");
		
		System.out.println(hashtable);
		
		System.out.println("Value for key 2 " + hashtable.get(2));
		
		
		
	}

}
