package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		// CRUD 
		
		map.put(1, "Namit");
		map.put(2 , "Student 1");
		map.put(5 , "User 1");
	map.put(null, "Null key only one allowed");
		map.put(99, null);
		map.put(98, null);
		map.put(97, null);  // values can be multiple null 
		map.putIfAbsent(1, "Rohekar"); // if key is absent then it adds it else no 
		map.put(1, "Rohekar"); // here it overrides the existing key 

		System.out.println(map);
		
		// to get the value if you know the key 
		System.out.println(map.get(2));
		System.out.println(map.get(44)); // returns null if key dosen't exist 
		System.out.println(map.getOrDefault(44,"Hello" )); // if the key exists it returns the actual value else it returns the default value you have provided 
		
		// check if key or value exits  returns boolean
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Namit"));
		
		// remove 
		map.remove(3);
		map.remove(2 ,"Student 1");
		
		
		// Looping through map  ( first  loop break if they have null values , 2nd breaks at toUpperCase NullPointerException )  || (can be handled manually)   
		
		 // the key set works like this : Set<Integer> keys =	map.keySet();
		
//		for (int i : map.keySet()) {
//			System.out.println(map.get(i));
//		}
	
		
		 Set<Map.Entry<Integer, String>> entries =	map.entrySet();
		 
		 for ( Entry<Integer, String> entry : entries) {
			 
			 //entry.setValue(entry.getValue().toUpperCase());
			 System.out.println(entry.getKey() +" : " +entry.getValue());
		 }
		 
		 
		
	}

}
