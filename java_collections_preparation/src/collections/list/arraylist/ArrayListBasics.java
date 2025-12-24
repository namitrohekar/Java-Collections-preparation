package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBasics {

	public static void main(String[] args) {
		
	// Ways to define ArrayList
		
	// most common 
	ArrayList<Integer>  list = new ArrayList<>();
	
	
	
	
	/*
	Programming to interface (Industry preferred)
	Loose coupling
	Easy to switch implementation later
	Best for production code
	*/
	
	//List<Integer> list2 = new ArrayList<Integer>();
	
	
	
	/*
	 * With initial capacity
	 * Avoids frequent resizing
	 * Used when size is roughly known
	 * */
	
	//ArrayList<Integer> list3 = new ArrayList<>(10);

	
	/* Using another collection
	 * Copies elements
	 * Useful in transformations
	 * */
	//List<Integer> list4 = new ArrayList<>(existingList);

	/*
	Using Arrays.asList (fixed-size list)
	Cannot add/remove elements
	List<Integer> list = Arrays.asList(1, 2, 3);
	*/
	
	
	// lets add elements 
	list.add(12); // added at 0
	list.add(24); // added at 1
	list.add(26); // added at 2
	
	// to get element at specific index
	System.out.println(list.get(1));
	
	System.out.println(list.size()); // gets the size of you arraylist
	
	// Print using normal for loop 
	for(int i = 0 ; i <list.size() ; i ++) {
		System.out.println(list.get(i));
	}
	
	// print using enhanced for loop 
	for ( Integer i : list) {
		System.out.println(i);
	}
	
	// check the existence of an element
	
	
	System.out.println(list.contains(12));  // true
	System.out.println(list.contains(99));  // false
	
	System.out.println(list.contains(list)); // false
	
	// remove element 
	list.remove(2); // removes the element at 2 index
	System.out.println(list);
	
	
	// add at specific index
	list.add( 2, 26);  // adds 26 on index 2 | by doing this you give index 2 value of 26 hence the other number who previously had index2 shifts forward
	System.out.println(list); 
	
	// now we will see set method that will give 2 to new value and replace its previous element
	list.set(1, 6);
	System.out.println(list);
	
	
	// lets make ArrayList of string 
	List<String> str = new ArrayList<>();
	str.add("Mango");
	str.add("Apple");
	str.add("Apple");
	str.add("Grape");
	
	str.contains("Apple");  // Gives the first occurrence index of specified element 
	str.remove("Apple");  // Now this also removes the first occurrence
	
	// now when we do this for Integer it confuses them with index 
	list.remove(1); // this will remove the index not the value itself
	// so we do like this 
	list.remove(Integer.valueOf(12)); // now its on 0th index but first occurrence of 12 will be removed
	
	
	System.out.println(list);
	
	
	
	
	
	
	// Create toArray 
	
	String [] arr = str.toArray( new String[0]);
	
	System.out.println(Arrays.toString(arr));
	
	
	// lets test sorting 
	
	list.add(13);
	list.add(31);
	list.add(4);
	list.add(22);
	
	list.sort(null); // null sorts in natural order i.e ascending 
	System.out.println(list);
	
	
	}
}
