/*
 * Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9

to

     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */
public class InvertBinaryTree {
	public TreeNode invertBinaryTree(TreeNode root)
	{
		if (root == null)
			return root;
		TreeNode tmp = root.left;
		root.left = invertBinaryTree(root.right);
		root.right = invertBinaryTree(tmp);
		return root;
	}

}
