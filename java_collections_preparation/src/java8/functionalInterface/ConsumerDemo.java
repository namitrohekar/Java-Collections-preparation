package java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		
		/*
		 * Consumer
		 * - It represents an operation that takes a single input (T) and returns no result.
		 * - Abstract method: void accept(T t)
		 * 
		 */
		
		Consumer<Integer> print = x -> System.out.println(x);
		print.accept(5);
		
		List<Integer> list = Arrays.asList( 1 , 2, 3, 4);
		
		Consumer<List<Integer>> printList = x -> {
			for ( int i : x) {
				System.out.println(i);
			}
		};
		
		printList.accept(list);
		
		Consumer<Integer> getSquare = x -> System.out.println(x * x);
		
		Consumer<Integer> printAndSquare = print.andThen(getSquare);
		
		printAndSquare.accept(4);
		
	}

}
