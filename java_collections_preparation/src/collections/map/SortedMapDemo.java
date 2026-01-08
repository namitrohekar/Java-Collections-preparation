package collections.map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	
	public static void main(String[] args) {
		
		SortedMap<String, Integer> sortedMap = new TreeMap<>();
		
		sortedMap.put("Namit", 99);
		sortedMap.put("Fyodor", 78);
		sortedMap.put("Viktor", 68);
		sortedMap.put("Friedrich", 100);
		sortedMap.put("Albert", 54);
		
	/*	System.out.println(sortedMap);
		
		// Some methods of SortedMap 
		
		System.out.println(sortedMap.firstKey()); // Gives the first key ( first key that appears depending upon sorting )
		System.out.println(sortedMap.lastKey());  // gives last key ( last key that appears depending upon sorting )
		System.out.println(sortedMap.headMap("Namit")); // works as toKey so from start to mentioned key (excluded)
		System.out.println(sortedMap.tailMap("Friedrich")); // works as fromKey so starts at specified key (Included) to end
		System.out.println(sortedMap.subMap("F", "V")); // first key is included last is excluded
		
 		*/
		
		
		NavigableMap<Integer, String> navigableMap = new TreeMap<>();
 		
		navigableMap.put(1, "One");
		navigableMap.put(4, "Four");
		navigableMap.put(2, "Two");
		navigableMap.put(3, "Three");
		navigableMap.put(0, "Zero");
		
		/*
		System.out.println(navigableMap);
		System.out.println(navigableMap.lowerKey(4));
		System.out.println(navigableMap.ceilingKey(5));
		System.out.println(navigableMap.higherEntry(3));
		System.out.println(navigableMap.descendingMap());
		*/
		
	}
}
