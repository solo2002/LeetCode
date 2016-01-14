/*
 * Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) 
	{
		if(head == null || head.next == null || head.next.next == null)
			return false;
		ListNode runner = head;
		ListNode follower = head;
		while (runner.next != null && follower.next != null)
		{
			runner = runner.next.next;
			follower = follower.next;
			if(runner == null || follower == null)
				return false;
			if(runner == follower)
				return true;
		}
		return false;
	}
}
