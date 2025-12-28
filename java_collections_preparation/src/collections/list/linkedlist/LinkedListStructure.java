package collections.list.linkedlist;

class Node{
	public int value;
	public Node next;
	public Node prev;
	
	
}


public class LinkedListStructure {

	public static void main(String[] args) {
		
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		
		node1.prev= null;
		node1.value = 1;
		node1.next = node2;
		
		node2.prev=node1;
		node2.value = 2;
		node2.next = node3;
		
		node3.prev=node2;
		node3.value = 3;
		node3.next = null;
		
	
		Node current = node1;
		
		while (current != null) {
			System.out.print(current.value + "<->");
			current = current.next;
		}
		
		System.out.print("null");
		
	}
}
