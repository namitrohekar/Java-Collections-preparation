package java8.lambdaExpression;

public class LambdaExpression {
	public static void main(String[] args) {
		
		/*
		 * Lambda Expression is an anonymous function ( no name , no return type , no access modifier)
		 * Used to Implement Functional Interface 
		 */
		
//		Thread t1 = new Thread(new Task()); // This much boiler plate code was needed lambda expression simplifies this 
//		t1.start();
		
		
		Thread t2 = new Thread(() -> {
			System.out.println("Hello");
			
		});
		t2.start();
		
		
		
		MathOperation sumOperation = ( a ,  b) -> a + b; // we are using reference of functional interface to hold lambda expression 
		
		int result = sumOperation.operate(2, 3);
		System.out.println(result);
	}

}

class Task implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Running !");
	}
}

// Lets create a interface with single method 
@FunctionalInterface
interface MathOperation {
	public int operate(int a , int b);
}
