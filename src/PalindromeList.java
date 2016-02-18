
/*
 * Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */
public class PalindromeList {
	public static Boolean isPalindrome (ListNode head)
	{//Time O(n), Space O(1)
		ListNode mid = head;
		ListNode fast = head;
		if (head == null)
			return true;
		while (fast.next != null && fast.next.next != null)
		{//for odd number of lists and even number of lists, to make sure that the slow stop at Middle of
		// the linked list
			mid = mid.next;
			fast = fast.next.next;
		}
		ListNode reverseRight = reverse(mid.next);
		ListNode left = head;
		ListNode right = reverseRight;
		mid.next = null;
		while (left != null && right != null)
		{
			if (left.val != right.val)
				return false;
			left =left.next;
			right = right.next;
		}//When the number of node is even, now both left and right are null now;
		//for the number of node is odd, now the left is at middle position, while right is null
		return true;//(left == mid || left == null);//both cases are palindrome
	}
	private static ListNode reverse(ListNode node) {
		// ListNode reverse
		if (node == null || node.next == null)
			return node;//empty or only one node
		ListNode current = node;
		ListNode newHead = null;
		while (current != null)
		{
			ListNode preCur = current;
			current = current.next;
			preCur.next = newHead;
			newHead = preCur;
		}
		return newHead;
	}
	public static ListNode reverseRecursive(ListNode node)
	{//recursive way to reverse Linked list
		if (node == null || node.next == null)
			return node;
		reverseRecursive(node.next);
		node.next.next = node;
		node.next = null;
		return node;	
	}
	
	public static void main(String[] args)
	{
		ListNode n0 = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 =  new ListNode(2);
		ListNode n4 = new ListNode(1);
		n0.next = n1; n1.next = n2; n2.next = n3; n3.next = n4; n4.next = null;
		System.out.println(isPalindrome(n0));
	}
}
