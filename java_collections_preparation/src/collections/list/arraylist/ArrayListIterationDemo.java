package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterationDemo {

	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		// Add elements
		list.add("Consistency");
		list.add("Dicipline");
		list.add("Obsession");
		list.add("Leadership");
		list.add("Dominance");
		list.add(null);
		list.add("Liberation");
		
		
		// Normal for loop
		
		System.out.println("Normal For Loop ->");
		for( int i = 0 ; i < list.size() ; i ++) {
			System.out.print(list.get(i) + " ");
		}
		
		
		System.out.println();
		System.out.println("Enchanced For loop");
		for ( String s : list) {
			
			System.out.print(s + " ");
		}
		
		System.out.println();
		System.out.println("Iterator");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		
		System.out.println();
		
		System.out.println("Using for each / lambda");
		list.forEach(l1 -> System.out.print(l1 + " "));
		
		
		
	} 
}
