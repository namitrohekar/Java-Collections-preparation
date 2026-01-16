package java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		 
		/*
		 * Predicate -> Functional interface ( Boolean valued Function)
		 * Predicate is a functional interface that evaluates a condition and returns true or false.
		 * 
		 */
		
		
		Predicate<Integer> isEven = x -> x % 2 == 0;
		System.out.println(	isEven.test(4));
		
		
		Predicate<String> isWordStartWithA = x -> x.toLowerCase().startsWith("a");
		System.out.println(isWordStartWithA.test("Alive"));
		
		// We can Combine predicates with and ,  or .
		
		Predicate<Integer> isGreaterThan10 = x -> x > 10;
		
		Predicate<Integer> evenAndGreaterThan10 = isEven.and(isGreaterThan10);
		System.out.println(evenAndGreaterThan10.test(12));
		
		
		Predicate<Integer> isOdd = x -> x % 2 !=0;
		
		Predicate<Integer> oddOrGreaterThan10 = isOdd.or(isGreaterThan10);
		System.out.println(oddOrGreaterThan10.test(8));
		
		// could have used negate to reverse the even 
		Predicate<Integer> isOdd2 = isEven.negate();
		System.out.println(isOdd2.test(2));
		
	}

}
