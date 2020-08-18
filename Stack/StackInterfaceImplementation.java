
/*time complexity of stack is(worst/push/pop)-O(1) because they only work with one end of data structure i.e. Top. 
 * LIFO/FILO
 * Stack class of java supports one default constructor stack() which is used to create empty stack.
 */


import java.util.Stack;
public class StackInterfaceImplementation {

	public static void main(String[] args) {
	
		Stack<String> stackobj = new Stack<String>();
		
		stackobj.add("SCOE");
		stackobj.add("BE");
		stackobj.add("IT");
		
		
		System.out.println("Initial Stack: " + stackobj);
		
		System.out.println("The Element at the top of Stack is: " + stackobj.peek()); 	//used to look at the object at top of this stack without removing it from to stack.
		
		System.out.println("The new Stack is: " + stackobj);
		
		System.out.println("The Size of Stack: " + stackobj.size());
		
		System.out.println("Does the Stack Contains 'BE' ?(true/false): " + stackobj.contains("BE"));
		
		System.out.println("Is the Stack Empty?(true/false): " + stackobj.isEmpty());
		
		
		System.out.println("Retriving Element is: " + stackobj.get(1));
		
		System.out.println("The Object that is replaced is: " + stackobj.set(2,"Information Technology"));
		
		System.out.println("The new Stack is: " + stackobj);
		
		System.out.println("Deleting Top most Element from Stack is: " + stackobj.pop()); 	//first-in last-out So IT will removed from stack
		//System.out.println(stackobj.pop()); 
		//System.out.println(stackobj.pop()); 
		
		System.out.println("Final Stack: " + stackobj);
	}

}
