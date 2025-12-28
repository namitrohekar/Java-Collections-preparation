package collections.list.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListFrequencyCounter {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(0);
		list.add(3);
		list.add(-3);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(0);
		list.add(-0);
				
	
		Map<Integer, Integer> freqMap = new HashMap<>();
		
		for ( Integer element : list) {
			
			// Check if element is already in map
			if(freqMap.containsKey(element)) {
				// If yes then get the current count and increment it 
				
				freqMap.put(element, freqMap.get(element) + 1);
			}
			
			else {
				// if no , then put element in map with count of 1
				freqMap.put(element, 1);
			}
			
			
		}
		
		System.out.println("Arraylist : " + list);
		System.out.println("Frequency Map : " + freqMap);
		
	}
}
