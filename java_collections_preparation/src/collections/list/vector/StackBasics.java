package collections.list.vector;

import java.util.LinkedList;
import java.util.Stack;

//  *IMP*  Stack is legacy; Deque implementations are preferred for stack behavior




public class StackBasics {

	public static void main(String[] args) {
		 
		Stack<Integer> stack = new Stack<>();
		 
		stack.push(19); // this way of adding is stacks very own way 
		stack.push(17); 
		stack.push(23); 
		stack.add(29); // the add method also works cause it extends Vector which implements List so it inherits List methods as well 
		
		
		System.out.println(stack);
		
	//	stack.pop();		// this removes the last added element hence following LIFO(Last In First Out) 
	
		//System.out.println(stack);
	//	stack.remove(1); // you can see remove method which comes from vector -> list 
	//	System.out.println(stack);
		
		// to see which element is at top you can use Peek which will let you see which element is at top 
		
		System.out.println(stack.peek());
		
		
		
		/*
		 * currently my stack looks like this 
		 * 29
		 * 23
		 * 17
		 * 19 
		 * so the search starts from the top and for  search method the indexing is 1 based so it will return the index of that element 
		 * whenever t appears if not then returns -1 
		 */
		
		System.out.println(stack.search(23)); 
		
		
		
		
		
		// Treating LinkedList as stack 
		
		LinkedList<Integer> linkedListAsStack = new LinkedList<>();
		
		linkedListAsStack.addLast(1); // doing add last to stimulate stack  so this is basically push 
		linkedListAsStack.addLast(5);
		linkedListAsStack.addLast(31);
		linkedListAsStack.addLast(37);
		
		
		linkedListAsStack.removeLast(); // now this is Pop 
		
		System.out.println(linkedListAsStack.getLast()); // this is just Peek 
		
		
	
	}
}
