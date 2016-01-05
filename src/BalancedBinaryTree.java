/*
 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the 
depth of the two subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root)
	{
		return treeDepth(root) != -1;
	}
	private int treeDepth (TreeNode root)
	{
		if (root == null)
			return 0;
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		if (left == -1 || right == -1)
			return -1;//the tree is imbalance;
		else if (Math.abs(left - right) <= 1)
			return Math.max(left, right) + 1;
		else
			return -1;
	}

}
