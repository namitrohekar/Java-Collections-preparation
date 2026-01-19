package java8.stream;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalOps {
	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		// 1 collect ( collect(Collectors.toList()) , works same as directly .toList() )
		 List<Integer> list = Arrays.asList(1 ,2 ,3 ,4 ,5);
		 
		 list.stream().skip(1).toList().forEach(System.out::println);		
		
		 
		 
		 // 2. forEach 
		 list.stream().forEach(x -> System.out.println(x));
		 
		 
		 //3 . reduce : Combines element to produce a single result
//		 Optional<Integer> optionalInt =	list.stream().reduce((x,y) -> x + y);
		 // doing method reference
		 Optional<Integer> optionalInt =	list.stream().reduce(Integer::sum);
		 System.out.println(optionalInt.get());
		 
		 
		// (Short Circuit operation -> finds one thing and stops processing immediately )
		 
		 // 4 . anyMatch , allMatch , noneMatch (SC)
		  
		 boolean a =	list.stream().anyMatch(x -> x % 2 == 0);
		 System.out.println(a);
		 
		 boolean b =	list.stream().allMatch(x -> x > 0 );
		 System.out.println(b);
		 
		 boolean c =	list.stream().noneMatch(x -> x < 0);
		 System.out.println(c);
		 
		 
		 // 5 . findFirst , findAny (SC)
		 
		 System.out.println(list.stream().findFirst().get());
		 System.out.println(list.stream().findAny().get());
		 
		 
		 
		 // Example : display names consisting more than 4 characters 
		 List<String> names = Arrays.asList("Virat" , "Kane" , "Root" , "Smith" , "Rohit", "MS Dhoni");
		 
		 names.stream().filter(x -> x.length() >4).toList().forEach(System.out::println);
		 
		 
		 //Example : Square numbers and then sort them 
		 
		 List<Integer> numbers = Arrays.asList(5 , 2 , 11 , 73 , 13);
		 
		 System.out.println(numbers.stream()
				 				   .map(x -> x * x)
				 				   .sorted().toList());
		 
		 System.out.println(numbers.stream().reduce(Integer::sum).get());
		 
		 
		 
		 // Example : Counting Occurrences of Characters 
		 // count occurrences of 'l'
		 
		 String sentence = "Hello World";
		 System.out.println(sentence.chars().filter(x -> x =='l').count());
		
		 
		 /*state-ful and state-less operation
		  * 
		  *  State-ful -> map, filter ( Each operation processed independently , no need to remember previous item)
		  *  state-less -> distinct , sorted , limit  ( need to remember previously seen element , high memory cost)
		  */
		 
		 
		 // Min and Max min ( min gets first element max gets last [order you can decide] )  
		 
		 System.out.println("Max" + Stream.of( 2 , 4 ,5).max( Comparator.naturalOrder()));
		 System.out.println("Min" + Stream.of( 2 , 4 ,5).min( Comparator.naturalOrder()));
		 
		 
		 
		 
		 
		 
	}

}
