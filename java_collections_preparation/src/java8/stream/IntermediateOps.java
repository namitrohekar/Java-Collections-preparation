package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {

	public static void main(String[] args) {
		
		/* Intermediate Operations transform a stream into another stream
		 * They are lazy , meaning they don't execute until a terminal operations is invoked   
		 */
		
		
		List<String> list = Arrays.asList("Albert" , "Nikola" , "Plank" , "Richard" , "Aristotle" , "Plato" , "Albert");
		// 1. Filter
		 Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
		 System.out.println(filteredStream); // no Filtering at this point as no terminal operator is there 
		 
		 System.out.println(filteredStream.toList());
		
		 // 2. map 
		 Stream<String> stringStream = list.stream().map(String::toUpperCase);
		 System.out.println(stringStream.toList());
		 
		 // 3. sorted 
		Stream<String> sortedStream = list.stream().sorted();
		System.out.println(sortedStream.toList());
		Stream<String> sortedUsingComparator = list.stream().sorted((a ,b) -> b.length() - a.length());
		System.out.println(sortedUsingComparator.toList());
		
		// 4. distinct
		
		System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());
		
		// 5. limit 
		
		System.out.println(Stream.iterate(1,  x -> x +1).skip(20).limit(100).toList());
		
	}
}
