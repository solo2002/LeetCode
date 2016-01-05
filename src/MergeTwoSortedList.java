/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made 
 * by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedList {

	public static ListNode mergeTwoSortedList(ListNode l1, ListNode l2)
	{
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode mergedList = null;
		ListNode current1 = l1;
		
		ListNode current2 = l2;
		ListNode tmp;//tmp always is the smaller ListNode or the last node current in merged list
		if (l1.val < l2.val)
		{
			mergedList = l1;
			current1 = l1.next;
			tmp = l1;
		}
		else
		{
			mergedList = l2;
			current2 = l2.next;
			tmp = l2;
		}
		
		while (current1 != null && current2 != null)
		{
			if (current1.val < current2.val)
			{
				tmp.next = current1;
				tmp = current1;
				current1 = current1.next;
			}
			else
			{
				tmp.next = current2;
				tmp = current2;
				current2 = current2.next;
			}
			//tmp = tmp.next;
		}
		if (current1 == null)
		{
			tmp.next = current2;
		}
		else
			tmp.next =current1;
		
		return mergedList;
	}
	public static void main(String[] args)
	{
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(7);
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(6);
		ListNode merged = mergeTwoSortedList(l1, l2);
		ListNode current = merged; 
		while (current != null)
		{
			System.out.print(current.val + "\t");
			current = current.next;
		}
		//System.out.println(Math.pow(2, 3));
	}
}
