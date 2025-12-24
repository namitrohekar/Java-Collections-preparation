package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



// **This is a helper file I learned along the way of Collection journey** 





// Understanding by student example

class Student {
	private String name;
	private double gpa;
	
	public Student( String name , double gpa) {
		this.name=name;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	public double getGpa() {
		return gpa;
	}

	@Override
	public String toString() {
		return "Student [name = " + name + ", gpa = " + gpa + "]";
	}
	
	
}



class StringLengthComparator implements Comparator<String> {

//	@Override
//	public int compare(String o1, String o2) {
//		
//		if ( o1 == null ) {
//			return 0 - o2.length();
//		}
//		if ( o2 == null ) {
//			return  o1.length() - 0;
//		}
//		
//		return o1.length() - o2.length();
//		
//	
//	}
	
	
//	if desc
	
	@Override
	public int compare(String o1, String o2) {
		
		if ( o1 == null ) {
			return  o2.length() - 0;
		}
		if ( o2 == null ) {
			return 0 - o1.length();
		}
		
		return o2.length() - o1.length();
		
	
	}
	
}




		/*
		 * Lets understand this Comparator what you pass in <here> it gives compare method for that object 
		 * it takes two inputs and naturally iterates through collection 
		 * now lets take two numbers like 7 and 4 
		 * if i assign 7 to o1 and 4 to o2 it gives me positive when i do return o1 - o2
		 * i will reverse execution by saying o2 - o1 and now the order will be descending
		 * 
		 * */

class IntegerSort implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		
		return o2 - o1;
	}
	
}



public class ComparatorBasics {

	public static void main(String[] args) {
		
		
		
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(12);
		nums.add(1);
		nums.add(5);
		nums.add(-9);
		nums.add(0);
		nums.add(-1);
		
		// if i have to sort in normal order then 
		//nums.sort(null);
		
		//nums.sort(new IntegerSort());
		
//		lets do lambda expression
	
		nums.sort( (a , b) -> a- b);
		
		
		
		System.out.println(nums);
		
		
		
		
		
		List<String> words = Arrays.asList("Mango" , "Bannana" , null, "grape" , "mango" , "Grape");
		
//		words.sort( new StringLengthComparator());
//		System.out.println(words);
		
		// lets handle the null with lambda expression
		
		//words.sort(( w1 , w2 ) ->  w1 !=null && w2 !=null ? w1.length() - w2.length() : w1 == null ? 0 - w2.length() : w1.length() - 0  ); // asc
		
//		words.sort((w1 , w2) -> w1 != null && w2 != null ? w2.length() - w1.length() : w2 == null? 0 - w1.length() : w2.length() - 0  ); // desc
		
		// modern approach 
		
		words.sort(Comparator.nullsLast(Comparator.comparingInt(String::length).reversed()));
		
		
		System.out.println(words);
		
		
		
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Namit", 3.1));
		students.add(new Student("Ani", 3.5));
		students.add(new Student("Rohit", 3.5));
		students.add(new Student("Sai", 3.6));
		students.add(new Student("Vinit", 3.3));
		
//		students.sort(( o1 , o2) -> {
//			if(o2.getGpa() > o1.getGpa()) return 1;
//			if(o2.getGpa() < o1.getGpa()) return -1;
//			return 0;
//		});
		
		
		// modern approach
		students.sort(Comparator.comparingDouble(Student::getGpa).reversed().thenComparing(Student::getName) );
		
		System.out.println(students);
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
