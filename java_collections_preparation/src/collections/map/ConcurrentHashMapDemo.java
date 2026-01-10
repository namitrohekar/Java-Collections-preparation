package collections.map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentHashMapDemo {
	
	public static void main(String[] args) {
		
		/*
		 * Java 7 --> in java 7 , segment based locking - 16 segments - smaller hash-maps
		 * so only segment being written to or read from is locked 
		 * read : do not require locking unless there is a write operation happening  on the same segment 
		 * write :lock 
		 */
		
		/*
		 * Java 8 --> no segmentation 
		 * 	Compare and Swap approach : no locking except resizing or collision 
		 */
		
		ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
		
		
		/*ConcurrentSkipListMap
		 * Skip list - probabilistic data structure that allows for efficient search , insertion and deletion operations 
		 * It is similar to a sorted linked list but with multiple layers that "skip" over portions of the list to provide faster access to elements 
		 */
		
		ConcurrentSkipListMap<String, Integer> skipList = new ConcurrentSkipListMap<>();
		
		
		
	}

}
