package collections.map;

//import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
	
	public static void main(String[] args) {
		
		String key1 = new String("key");
		String key2 = new String("key");
		
//		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new IdentityHashMap<>(); // uses reference equality (==) instead of equals()
		map.put(key1, 1);
		map.put(key2, 2);
		
		System.out.println(key1.equals(key2)); // true in both 
		System.out.println(map); // only key=2 in HashMap and key=1 , key=2 in IdentityHashMap 
		
	}

}
