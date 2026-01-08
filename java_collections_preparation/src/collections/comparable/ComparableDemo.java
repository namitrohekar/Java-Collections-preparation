package collections.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


class Student implements Comparable<Student>{
	
	private String name;
	
	private double gpa;
	
	public Student(String name , double gpa) {
		this.name=name;
		this.gpa=gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name , gpa);
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if( obj.getClass() !=getClass() || obj == null) return false;
		
		Student student =	(Student) obj;
		
		return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name , student.name);
	}
	

	@Override
	public int compareTo(Student o) {
		
		  return Double.compare(o.gpa, this.gpa);
	}
	
	
}

public class ComparableDemo {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("Namit", 9.9));
		list.add(new Student("Mark", 9.8));
		list.add(new Student("Elon", 10));
		list.add(new Student("Larry", 8.8));
		list.add(new Student("Steve", 7.7));
		
		list.sort(null);
		System.out.println(list);
		
		/*
		List<Integer> numbers = Arrays.asList( 12 , 23 ,44 ,66 ,88 ,2 ,5 );
		numbers.sort((a,b) -> b - a);
		System.out.println(numbers);
		*/
	}

}
