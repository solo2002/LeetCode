/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack
 */
public class MinStack {
	class Node 
	{
		int value;
		int min;
		Node next;
		
		Node(int val, int m)
		{
			value = val;
			min = m;
			next = null;
		}
	}
	Node head;
	
	public void push(int x)
	{
		if (head == null)
		{
			head = new Node(x, x);
		}
		else
		{
			Node newNode = new Node(x, Math.min(x, head.min));
			newNode.next = head;
			head = newNode;
		}
	}
	public void pop()
	{
		if (head != null)
		{
			head = head.next;
		}
	}
	public int top()
	{
		if (head != null)
			return head.value;
		return -1;
	}
	public int getMin()
	{
		if (head != null)
			return head.min;
		return -1;
	}
}
