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
	
	public boolean isEmpty()			
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==capacity-1;					
	}
	
	public int push(int data)					
	{
		if(isFull())
		{
			System.out.println("Stack is Full");	
		}
		return stack[++top] = data;
	}
	
	public int pop()							
	{
		if(isEmpty())							
		{
			System.out.println("Stack is Empty");
		}
		return stack[top--];		
	}
	
	public int peek()				
	{
		return stack[top];			
	}
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
		System.out.println("The top most Deleting element is: " + st.pop());
		//System.out.println("The top most Deleting element is: " + st.pop());
		//System.out.println("The top most Deleting element is: " + st.pop());
		//System.out.println("The top most Deleting element is: " + st.pop());
		st.display();

	}
}
