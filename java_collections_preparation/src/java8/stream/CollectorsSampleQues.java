package java8.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CollectorsSampleQues {
	
	public static void main(String[] args) {
		
		// Example 1 : Collecting Names By length 
		
		List<String> l1 = Arrays.asList("Veni" , " Vedi" , "Veci" , "AWS" ,"Docker" , "Kubernets");
		
		System.out.println(l1.stream().map(String::trim).collect(Collectors.groupingBy( String::length)));
		
	
		// Example 2 : Counting word occurrences
	
		String sentence = "Hello World Hello Java world";
		
		System.out.println(Arrays.stream(sentence.toLowerCase().split(" ")).collect(Collectors.groupingBy(x -> x , Collectors.counting())));
		
		// Example 3 : Partitioning Even and Odd numbers 
		
		List<Integer> numbers = Arrays.asList( 1 , 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9, 0);
		System.out.println(numbers.stream().collect(Collectors.partitioningBy( x -> x % 2== 0)));
		
		
		// 4. Summing values in a Map 
		Map<String, Integer> items = new HashMap<>();
		items.put("Apple", 10);
		items.put("Mango", 20);
		items.put("Bananna", 15);
		
		System.out.println(items.values().stream().collect(Collectors.summingInt( x -> x)));
		
		// 5. Create a Map from Stream Elements 
		
		List<String> l2 = Arrays.asList("Veni" , " Vedi" , "Veci" , "AWS" ,"Docker" , "Kubernets");
		
		System.out.println(l2.stream().collect(Collectors.toMap(x -> x.trim().toUpperCase(), x -> x.length())));
		
		List<String> l3 = Arrays.asList("Veni" , " Vedi" , "Veci",  "Veci" , "AWS" ,"Docker" , "Docker" , "Kubernets");
		
		System.out.println(l3.stream().collect(Collectors.toMap(k -> k, v -> 1 , (x , y) -> x  + y)));
		
	}

}
