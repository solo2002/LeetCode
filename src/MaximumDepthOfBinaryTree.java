/*
 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to 
the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree {
	public static int maxDepth(TreeNode root) 
	{
      if (root == null)
    	  return 0;
      return (maxOfTwo(maxDepth(root.left), maxDepth(root.right)) + 1);
    }
	private static int maxOfTwo(int a, int b)
	{
		if (a > b)
			return a;
		return b;
	}
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(2);
		TreeNode left2 = new TreeNode(3);
		root.left = left;
		root.right = right;
		root.left.left = left2;
		System.out.println(maxDepth(root));
	}

}
