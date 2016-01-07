/*
 * Write a program to find the node at which the intersection of two singly linked lists 
 * begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.
 */
public class IntersectionOfTwoLinkedList {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB)
	{//switch the node after finish traversal one LinkedList, two pointer either meet at
		//the same node or both end with null value (if not intersected)
		if (headA == null || headB == null)
			return null;
		ListNode a = headA;
		ListNode b = headB;
		while (a != b)
		{
			if (a != null)
				a = a.next;
			else
				a = headB;
			if (b != null)
				b = b.next;
			else
				b = headA;
		}
		return a;
	}

}
