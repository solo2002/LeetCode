/*
 * Given a binary tree, return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class BinaryTreeLevelTraversal2 {
	public List<List<Integer>> levelOrder(TreeNode root)
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty())
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
			result.add(list);
		}
		return result;
		
	}
}
