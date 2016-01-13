/*
 * Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?


 */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
public class BinaryTreePreorderTraversal {
//recursive version
	public List<Integer> preorderTraversal(TreeNode root)
	{
		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		path(root, result);
		return result;
	}
	public void path(TreeNode root, List<Integer> result)
	{
		if (root == null)
			return;
		result.add(root.val);
		path(root.left, result);
		path(root.right, result);
	}
//iterative solution
	public void path2(TreeNode root, List<Integer> result)
	{
		if (root == null)
			return;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while(!s.isEmpty())
		{
			TreeNode node = s.pop();
			result.add(node.val);
			if (node.right != null)
				s.push(node.right);
			if (node.left != null)
				s.push(node.left);
		}
	}
public static void main(String[] args)
{
	
}
	
}
