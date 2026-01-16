package java8.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionDemo {

	public static void main(String[] args) {
		
		/*
		 * Function -> work for you 
		 * Function<T, R> is a functional interface in java.util.function.
		 * - It represents a transformation: takes an input of type T and returns a result of type R
		 * - Abstract method: R apply(T t)
		 */
		
		Function<Integer, Integer> doubleIt =  x -> 2 * x;
		System.out.println(doubleIt.apply(100));
		
		// you can chain two or more together 
		Function<Integer, Integer> tripleIt = x -> 3 * x;
		System.out.println(doubleIt.andThen(tripleIt).apply(100)); // working of andThen -> exe 1st andThen exe 2nd
		System.out.println(doubleIt.compose(tripleIt).apply(100)); // working of compose -> exe 2nd compose exe 1st 
		
		
		
		Function<Integer, Integer> identity = Function.identity();
		System.out.println(identity.apply(5));
		
		BiFunction<Integer, Integer, Integer> sum = (a , b) -> a + b;
		System.out.println(sum.apply(10, 20));
		
		
		//UnaryOperator is a specialization of Function where input and output types are the same
		UnaryOperator<Integer> a = x-> x * 2;
		System.out.println(a.apply(10));
		
		// BinaryOperator is a specialization of BiFunction where both inputs and output are the same type
		BinaryOperator<Integer> b = (x , y) -> x +y;
		System.out.println(b.apply(20, 30));
	}
}
