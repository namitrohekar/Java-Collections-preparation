package collections.list.copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		
		/*
		 * "Copy on Write" means that whenever a write operation like adding or removing an element 
		 * instead of directly modifying the existing list 
		 * a new copy of the list is created and the modification is applied to that copy 
		 * this ensures that other threads reading the list while it's being modified are unaffected 
		 */
		
		/*
		 * Read Operations : Fast and direct, since they happen on a stable list without interference from modifications. 
		 * Write Operations : A new copy of list is created for every modification 
		 * 					  The reference to the list is then updated so that subsequent reads use this new list  
		 * 						
		 */
		 
		
		// we use this when read intensive tasks
		
		
		
		// lets understand this via example 
		// make a list of shoppingList run a loop if you see "Eggs" add "Butter" to shoppingList 
		
	//	List<String> shoppingList = new ArrayList<>(); // this will give ConcurrentModificationException so comment this and uncomment below 
		List<String> shoppingList = new CopyOnWriteArrayList<>(); // CopyOnWriteArrayList
		
		shoppingList.add("Milk");
		shoppingList.add("Bread");
		shoppingList.add("Eggs");
		shoppingList.add("Spinach");
		shoppingList.add("Chicken");
		
		
		System.out.println("Initial shopping list : " + shoppingList);
		
		for (String item : shoppingList) {
			System.out.println(item);
			if(item.equals("Eggs")){
			shoppingList.add("Butter");
			System.out.println("Added butter while reading");
				
			}
				
		}
			
		System.out.println("Updated shopping list" + shoppingList);
		
		
		
	}

}
