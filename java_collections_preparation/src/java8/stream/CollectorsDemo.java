package java8.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		
		/*
		 * Collectors is a utility class 
		 * it provides a set of methods to create common collectors 
		 */
		
		// 1. Collecting to a List 
		List<String> names = Arrays.asList("Phelps" , "Kobe" , "Tyson" , "Kohli" , "Conor" , "Ali" );
		List<String> list =	names.stream().filter(x -> x.toLowerCase().startsWith("a")).collect(Collectors.toList());
		System.out.println(list);
		 
		// 2. Collecting to a Set 
		List<Integer> numbers = Arrays.asList( 1 ,2 ,3, 4 ,5 ,5 ,2 , 3 ,3 );
		Set<Integer> set=	numbers.stream().collect(Collectors.toSet());
		System.out.println(set);
		
		// 3. Collecting to a Specific Collection
		 HashSet<String> hashSet = names.stream().collect(Collectors.toCollection(() -> new HashSet<>()));
		 
		// 4. Joining Strings  ( Concatenates stream elements into single string)
		 String concatenatedNames =	names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
		 System.out.println(concatenatedNames);
		 
		 
		 // 5. Summarizing Data 
		 // Generates Statistical summary (count , sum , min , avg ,max )
		 
		 List<Integer> data = Arrays.asList( 2 ,3 ,5 , 7 , 37, 11 , 13 , 17);
		 
		 IntSummaryStatistics stats = data.stream().collect(Collectors.summarizingInt(x -> x));
		 
		 System.out.println("Count : " + stats.getCount());
		 System.out.println("Sum : " + stats.getSum());
		 System.out.println("Min : " + stats.getMin());
		 System.out.println("Max : " + stats.getMax());
		 System.out.println("Average : " + stats.getAverage());
		 
		 // Performing Direct Operations 
		 System.out.println("Direct Average : "+ data.stream()
				 									  .collect(Collectors.averagingDouble(x -> x))	);

		 System.out.println("Direct Count : "+ data.stream()
		 .collect(Collectors.counting())	);
		 
		 // Grouping Elements 
		 List<String> words = Arrays.asList("Hello" , "Four" , "Ford" , "Java" , "Streams" , "Collections");
		System.out.println( words.stream().collect(Collectors.groupingBy( x -> x.length()))); 
		System.out.println( words.stream().collect(Collectors.groupingBy( String::length , Collectors.joining(", ")))); 
		System.out.println( words.stream().collect(Collectors.groupingBy( String::length , Collectors.counting()))); 
		
		TreeMap<Integer, Long> treeMap =	words.stream().collect(Collectors.groupingBy(String::length , TreeMap :: new ,Collectors.counting()));
		System.out.println(treeMap); 
		
		
		
		// (. Partitioning Elements 
		// Partitions elements into two groups ( true and false ) based on a predicate 
		
		System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 4)));
		
		
		// Mapping and collecting 
		// Applies mapping function before collecting 
		
		System.out.println(words.stream().collect(Collectors.mapping( String::toUpperCase, Collectors.toList())));
		
		 
	}
}
