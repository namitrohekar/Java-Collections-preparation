package collections.list.vector;


import java.util.LinkedList;
import java.util.Vector;

public class VectorBasics {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>(5 , 3);
		vector.add(3);
		vector.add(3);
		vector.add(3);
		vector.add(3);
		vector.add(3);
		vector.add(3);
		System.out.println(vector.capacity());
		
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		
		Vector<Integer> vector1 = new Vector<Integer>(linkedList);
		
		System.out.println(vector1 );
		
	}
}
