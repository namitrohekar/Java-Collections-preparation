package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveDuplicatesSimple {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
	
		list.add(13);
		list.add(41);
		list.add(13);
		list.add(7);
		list.add(11);
		list.add(73);
		list.add(7);
		list.add(73);
		list.add(73);
		System.out.println("Orignal list with duplicates ");
		System.out.println(list);
		
		
		
		for ( int i = 0 ; i < list.size() ; i ++) {
			
			for ( int j = i + 1 ; j < list.size() ; j ++) {
				
				if(list.get(i).equals(list.get(j))) {
					
					list.remove(j);
					j--;
				}
			}
		}
		
		System.out.println("List with no duplicates");
		System.out.println(list);
		
		
		
		
	}

}
