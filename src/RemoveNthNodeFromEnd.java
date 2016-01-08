/*
 * Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */
public class RemoveNthNodeFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n)
	{
		if (head == null)
			return head;
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && n > 0)
		{
			fast = fast.next;
			n--;
		}
		if (fast == null)
		{//remove head
			head = head.next;
			return head;
		}
		while (fast.next != null)
		{
			slow = slow.next;
			fast = fast.next;
		}//slow is at the node just before the one need to be removed
		ListNode tmp = slow.next;
		slow.next = slow.next.next;
		tmp.next = null;
		return head;
	}

}
