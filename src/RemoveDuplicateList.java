/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicateList {
	public static ListNode removeDuplicateList(ListNode head)
	{//remove prior node with same val instead of remove next one
		/*if (head == null || head.next == null)
			return head;
		ListNode current = head;
		while (current != null)
		{
			if (current.next != null && current.val == current.next.val)
				{
					current.next = current.next.next;
				}
			else
				current = current.next;
		}
		return head;*/
		
		if(head == null || head.next == null)
      return head;
  
  ListNode runner = head.next;
  ListNode follower = head;
  while(runner != null)
  {
      if(follower.val == runner.val)
      {
          follower.next = runner.next;
          runner = runner.next;
      }
      else
      {
          follower = runner;
          runner = runner.next;
      }
      
  }
  return head;
	}
	public static void main(String[] args)
	{
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(1);
		head = removeDuplicateList(head);
		ListNode current = head;
		while (current != null)
		{
			System.out.println(current.val);
			current = current.next;
		}
		
	}
}
