package java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ExampleImplementation {
	public static void main(String[] args) {
		
		 // A Combined Example 
		  
		  Predicate<Integer> predicate = x -> x % 2 == 0;
		  Function<Integer, Integer> function = x -> x * x ;
		  Consumer<Integer> consumer = x -> System.out.println(x);
		  Supplier<Integer> supplier = () -> 10;
		  
		  
		  if(predicate.test(supplier.get())) {
			  consumer.accept(function.apply(supplier.get()));
		  }
		  
		  // Bi-version of all , BiPredicate , BiFunction , BiConsumer 
		  
		  
		  BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;
	        System.out.println(isSumEven.test(3, 5)); // true (sum = 8)

		  
		  BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
	        System.out.println(multiply.apply(4, 6)); // 24

		  
		  BiConsumer<String, Integer> printNameAndAge = (name, age) ->
        System.out.println(name + " is " + age + " years old");
    
        printNameAndAge.accept("Namit", 99);
        
        
        //Method reference refers to a method without calling it, letting the functional interface invoke it.
        
        List<String> students = Arrays.asList("Nikola" , "Issac" , "Albert" , "Richard");
        students.forEach(System.out::println);
        
        // Constructor Reference 
        List<String> names = Arrays.asList("iPhone" , "Pixel" , "Samsung");
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).collect(Collectors.toList());
        
	}
	
	static class MobilePhone{
		String name;
		
		public MobilePhone( String name) {
			this.name=name;
		}
	}

}
