/*
 * Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest 
leaf node.
 */
//If a node has only one subtree, either left or right, then it is not a leaf.
import java.util.Queue;
import java.util.LinkedList;
public class MinDepthOfBinaryTree {

	public int minDepth(TreeNode root)
	{
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		else if (root.left == null || root.right == null)
			//only onew subtree, either left or right, then the other side is not a leaf
			return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
		else //both have subtree
			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
	//use BFS
	public int minDepth2(TreeNode root)
	{
		if (root == null)
			return 0;
		int depth = 1;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty())
		{
			int size = q.size();
			for (int i = 0; i < size; i++)
			{
				TreeNode node = q.poll();
				if (node.left == null && node.right == null)
					return depth;
				if (node.left != null)
					q.add(root.left);
				if (node.right != null)
					q.add(root.right);
			}
			depth++;
		}
		return depth;
		
	}
}
