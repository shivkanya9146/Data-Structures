import java.util.Stack;
public class StackInterfaceImplementation {

	public static void main(String[] args) {
		Stack<String> stackobj = new Stack<String>();
		
		stackobj.add("SCOE");
		stackobj.add("BE");
		stackobj.add("IT");
		
		System.out.println("Initial Stack: " + stackobj);
		System.out.println("The Element at the top of Stack is: " + stackobj.peek());
		System.out.println("The new Stack is: " + stackobj);
		System.out.println("The Size of Stack: " + stackobj.size());
		System.out.println("Does the Stack Contains 'BE' ?(true/false): " + stackobj.contains("BE"));
		System.out.println("Is the Stack Empty?(true/false): " + stackobj.isEmpty());
		System.out.println("Retriving Element is: " + stackobj.get(1));
		System.out.println("The Object that is replaced is: " + stackobj.set(2,"Information Technology"));
		System.out.println("The new Stack is: " + stackobj);
		System.out.println("Deleting Top most Element from Stack is: " + stackobj.pop()); 	
		//System.out.println(stackobj.pop()); 
		//System.out.println(stackobj.pop()); 
		System.out.println("Final Stack: " + stackobj);
	}

}
