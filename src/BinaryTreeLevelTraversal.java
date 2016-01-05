/*
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
 * (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreeLevelTraversal {
	public List<List<Integer>> levelOrderTraversal(TreeNode root)
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null)
			return result;
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();//use a queue to hold the node
		q.add(root);
		while(!q.isEmpty())
		{
			List<Integer> list = new LinkedList<Integer>();
			int size = q.size();
			for (int i = 0; i < size; i++)
			{
				TreeNode node = q.poll();
				list.add(node.val);
				if (node.left != null) q.add(node.left);
				if (node.right != null) q.add(node.right);
			}
			result.add(0, list);
		}
		return result;
	}
}
