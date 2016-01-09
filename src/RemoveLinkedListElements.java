/*
 * Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class RemoveLinkedListElements {
	 public ListNode removeElements(ListNode head, int val)
	 {
		 if (head == null)
			 return head;
		 while (head != null && head.val == val)
			 head = head.next;
		 if (head != null)
		 {
			 ListNode follower = head;
			 ListNode runner = follower.next;
			 while (runner != null)
			 {
				 if (runner.val == val)
				 {
					 follower.next = follower.next.next;
					 runner = follower.next;
				 }
				 else
				 {
					 follower = follower.next;
					 runner = runner.next;
				 }
			 }
		 }
		 return head;
	 }
}
