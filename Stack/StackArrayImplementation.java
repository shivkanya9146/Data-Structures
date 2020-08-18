/*time complexity of stack is(worst/push/pop)-O(1) because they only work with one end of data structure i.e. Top. 
 */
public class StackArrayImplementation {
	
	int top;
	int capacity;
	int[] stack;
	
	StackArrayImplementation()
	{
		top=-1;
		capacity=10;
		stack=new int[capacity];
	}
	
	public boolean isEmpty()			//return true if stack is empty
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==capacity-1;					
	}
	
	public int push(int data)					//adds item into stack
	{
		if(isFull())
		{
			System.out.println("Stack is Full");	//check overflow condition
		}
		return stack[++top] = data;
	}
	
	public int pop()							//remove element from stack,elements are popped in reversed order in which they are pushed.
	{
		if(isEmpty())							//check underflowcondition
		{
			System.out.println("Stack is Empty");
		}
		return stack[top--];		//removing top element
	}
	
	public int peek()				//return top element of stack
	{
		return stack[top];			//returning top element
	}
	
	/*public void display()
	{
		for(int i:stack)
		{
			System.out.println(i);
		}
	}*/
	public void display() {
		   if(top>=0) {
			   System.out.println("The new Stack is:");
		      for(int i=top; i>=0; i--)
		    	  System.out.println(stack[i]+" ");
		      System.out.println("");
		   } else
			   System.out.println("Stack is empty");
		}
	
	public static void main(String[] args) {

		StackArrayImplementation st=new StackArrayImplementation();
		
		st.push(20);
		st.push(10);
		st.push(30);
		st.push(50);
		st.push(80);
		
		System.out.println("Does the Stack is empty: " + st.isEmpty());
		
		System.out.println("Does the Stack is full: " + st.isFull());
		
		System.out.println("The Stack capacity: " + st.capacity);
		
		System.out.println("The Element at the top of Stack is: " + st.peek());
		
		System.out.println("The top most Deleting element is: " + st.pop());
		
		//System.out.println("The top most Deleting element is: " + st.pop());
		//System.out.println("The top most Deleting element is: " + st.pop());
		//System.out.println("The top most Deleting element is: " + st.pop());
		//System.out.println("The top most Deleting element is: " + st.pop());
		
		 //getting 0 for empty stack
		st.display();
		
		
		

	}

}
