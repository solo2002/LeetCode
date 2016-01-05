/*
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around 
 * its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
 */
public class SysmmetricTree {
	public boolean isSysmmetrice(TreeNode root)
	{
		if (root == null)
			return true;
		return isMirror(root.right, root.left);
	}
	
	private boolean isMirror(TreeNode a, TreeNode b)
	{
		if (a == null && b == null)
			return true;
		else if (a == null || b == null)
			return false;
		else
			return (a.val == b.val && isMirror(a.left, b.right) && isMirror(a.right, b.left));
	}

}
