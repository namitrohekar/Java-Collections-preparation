package java8.functionalInterface;

import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		/*
		 * Supplier
		 * - It represents a supplier of results: takes no input, returns a value of type T.
		 * - Abstract method: T get()
		 */
		
		
		Supplier<String> welcomeMsg = () -> "Hello , Welcome !";
		
		  System.out.println("New User " + welcomeMsg.get());
		  
		  
		  
		 

		  
	}

}
