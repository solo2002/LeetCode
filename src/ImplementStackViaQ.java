import java.util.LinkedList;
import java.util.Queue;


/*
 * Using queue to implement Stack
 */
public class ImplementStackViaQ {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	 public void push(int x) 
	 {
	        if (q1.isEmpty() && !q2.isEmpty())
	        {
	           q2.add(x);
	        }
	        else
	        	q1.add(x);
	 }

	    // Removes the element from in front of queue.
	    public void pop() 
	    {
	        if (q1.isEmpty() && !q2.isEmpty())
	        {
	        	int pop;
	        	for(int i = 0; i < q2.size() - 1; i++)
	        	{
    	        	pop = q2.remove();
    	        	q1.add(pop);
    	        }
	        	q2.remove();
	        }
	        else
	        {
	        	int pop;
	        	for(int i = 0; i < q1.size() - 1; i++)
	        	{
    	        	pop = q1.remove();
    	        	q2.add(pop);
    	        }
	        	q1.remove();
	        }
	    }

	 // Get the top element.
	  
	    public int top() {
	    	int pop = 0;
	    	if (q1.isEmpty() && !q2.isEmpty())
	        {
	        	for(int i = 0; i < q2.size(); i++)
	        	{
    	        	pop = q2.remove();
    	        	q1.add(pop);
    	        }
	        	return pop;
	        }
	        else
	        {
	        	for(int i = 0; i < q1.size(); i++)
	        	{
    	        	pop = q1.remove();
    	        	q2.add(pop);
    	        }
	        	return pop;
	        }
	    }

	    // Return whether the queue is empty.
	    public boolean empty() {
	        return q1.isEmpty() && q2.isEmpty();
	    }
	    
	 

}
