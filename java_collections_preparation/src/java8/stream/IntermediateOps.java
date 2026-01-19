package java8.stream;

import java.util.ArrayList;
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
		
		// peek -> ( Performs an action on each element as it is consumed)
		
		Stream.iterate(1 , x  -> x+ 1).skip(10).limit(10).peek(System.out::println).count();
		
		/* flatMap 
		 * Handle streams of collections , lists or arrays where each element is itself a collection
		 * Flatten nested structures ( e.g , lists within lists ) so that they can be processed as a single sequence of elements 
		 * Transform and flatten at the same time 
		 * 
		*/
		
	List<List<String>> listOfLists = Arrays.asList(
				Arrays.asList("Apple" , "Mango"),
				Arrays.asList("Orange" , "Kiwi"),
				Arrays.asList("Pear" , "Grape")
				
				);
	
	System.out.println(listOfLists.get(2).get(1));
	
	 List<String> flatList =listOfLists.stream().flatMap( x -> x.stream()).map(String::toUpperCase).toList();
 		System.out.println(flatList);
		
		List<String> sentences = Arrays.asList(
				"Hello World",
				"Java Streams are powerful",
				"flatmap is useful"
				);
		
		List<String> words = sentences.stream().flatMap( sen -> Arrays.stream(sen.split(" "))).map(String::toUpperCase).toList();
		System.out.println(words);
		
	}
}
