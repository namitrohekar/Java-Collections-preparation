package java8.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		/*
		 * Stream -->
		 * Stream API is used to process collections of objects A Stream in java is a sequence of objects that supports various 
		 * methods that can be pipelined to produce desired result 
		 * Uses -> 1. Stream API is a way to express and process collections of objects 
		 * 		   2. Enable us to perform operations like filtering , mapping , reducing and sorting.
		 */
		
		// Creating Streams 
		// 1. From collections 
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream();
		
		// 2. From Arrays 
		
		String[] array = {"a" , "b" , "c"};
		Arrays.stream(array);
		
		// 3. Using Stream.of()
		Stream<String> stream2 = Stream.of("a" ,"b");
		
		// 4 Infinite Streams 
		Stream<Integer> generate = Stream.generate(() -> 1);
		Stream.iterate(1 , x -> x + 1).limit(100).collect(Collectors.toList());
	
		
	
		
		
		
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		  
		// Stream<Integer> stream = numbers.stream();
		
		
		long evenCount = numbers.stream().filter(x -> x % 2 ==0).count(); // Counts the even number in the stream 
		
		System.out.println(evenCount);
		
		
	}

}
