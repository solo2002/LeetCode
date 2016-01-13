/*Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?
 * 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
public class BinaryTreeInorderTraversal {
	 public List<Integer> inorderTraversal(TreeNode root)
	 {
		 List<Integer> result = new ArrayList<Integer>();
		 //if (root == null) return result;
		 traversal(root, result);
		 return result;
	 }
	 public void traversal(TreeNode root, List<Integer> result)
	 {//recursive version
		 if (root == null) return;
		 traversal(root.left, result);
		 result.add(root.val);
		 traversal(root.right, result);
	 }
	 public void traversal2(TreeNode root, List<Integer> result)
	 {//iterative version
		 if(root == null) return;
		 Stack<TreeNode> s = new Stack<>();
		 TreeNode node = root;
		 while(node != null || !s.isEmpty())
		 {
			 while(node != null)
			 {
				 s.push(node);
				 node = node.left;
			 }
			 node = s.pop();
			 result.add(node.val);
			 node = node.right;
		 }
	 }
}
