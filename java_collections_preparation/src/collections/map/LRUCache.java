package collections.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LRUCache<K,V> extends LinkedHashMap<K, V> {
	
	private int capacity;
	
	public LRUCache(int capacity){
		super(capacity , 0.75f , true);
		this.capacity = capacity;
		
	}
	
	
	
	
	
	@Override
	protected boolean removeEldestEntry(Entry<K, V> eldest) {

		return size() > capacity;
	}





	public static void main(String[] args) {
		
		LRUCache<String, Integer> studentMap = new LRUCache<>(3);
		
		studentMap.put("Namit", 99);
		studentMap.put("Uncle Bob", 22);
		studentMap.put("Linus", 88);
		studentMap.put("Mark", 91);
		
		System.out.println(studentMap);  // here you can see the eldest entry gets removed 
		
	}

}
