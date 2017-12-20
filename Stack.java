/**
 * This is the class to implement a stack.
 * 
 * The stack should hold string data and have a constructor with one
 * integer parameter (the size of the stack).
 *
 * You have the freedom to choose how to implement your stack using any
 * of the data structures we have already studied (arrays, ArrayLists,
 * linked lists, binary trees, etc.).
 * 
 * @author Michael Ida
 *
 */
public class Stack implements StackInterface {

	// Set up the basic elements of your data structure here.
	
	/*
	 * This is the constructor for the Stack class.  Notice
	 * there is one integer parameter (the size of the stack).
	 */
	String[] stack;
	
	public Stack(int size) {
	 stack = new String[size];
	}
	
	 public boolean push(String record) {
		 for (int i = 0; i<stack.length; i++) {
			 while (stack[i] == null) {
				 stack[i] = record;
				 return true;
			 }
		 }
		 return false;
	 }
	
	 public String pop() {
		 for (int i = 0; i < stack.length - 1; i++) {
			 if(stack[i+1] == null) {
				 String pop = stack[i];
				 stack[i] = null;
				 return pop;
			 }
		 
			 
		 }
		 String pop1 = stack[stack.length -1];
		 stack[stack.length - 1] = null;
		return pop1;
		 
	 }
	 
	 public void printStack() {
		 for (int i= stack.length - 1; i > -1; i--) {
			 if (stack[i] == null) {
			
		 } else {
			 System.out.println(stack[i]);
		 }
	 }
}
}