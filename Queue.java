/*
 * This is the class that implements the queue data structure.
 * You may decide what data structure to use to implement it.
 */
public class Queue {

	private Node back;
	
	
	public Queue() {
		back = null;
		
	}
	
	public void enqueue(String record) {
		Node newNode = new Node(record);
		newNode.next = null;
		Node pointer = back;
		
		if (back != null) {
			while (pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = newNode;
			newNode.next = null;
			} else {
				back = newNode;
				newNode.next = null;
			}
		
	}
	
	public String dequeue() {
		String dequeue;
		Node pointer = back;
		while(pointer.next != null) {
			pointer = pointer.next;
		}
		dequeue = pointer.record;
		return dequeue;
	}
	
	public void printQueue() {
		Node pointer = back;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
			}
		System.out.println();
		}
	
	}

