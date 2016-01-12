/*
 * Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
 */
import java.util.List;
import java.util.ArrayList;
public class BinaryTreePaths {
	 List<String> result;
   public List<String> binaryTreePaths(TreeNode root) {
       result = new ArrayList<String>();
       if(root == null)
           return result;
       path(root, "");
       return result;
   }
   public void path(TreeNode root, String s)
   {
  	 
  	 if (root.left == null && root.right == null)
     {//a leaf node
         s = s + root.val;
         result.add(s);
         return;
     }
  	 s = s + root.val + "->";
  	 if (root.left != null)
  	 {
  		 path(root.left, s);
  	 }
  	 if (root.right != null)
  	 {
  		 path(root.right, s);
  	 }
  	 
  	 /*if (root == null) return;
       if (root.left == null && root.right == null)
       {//a leaf node
           s = s + root.val;
           result.add(s);
       }
       else
       {
      	 s = s + root.val + "->";
      	 if (root.left != null)
      	 {
      		 path(root.left, s);
      	 }
      	 if (root.right != null)
      	 {
      		 path(root.right, s);
      	 }
       }*/
   }
   public static void main(String[] args)
   {
  	 String s = "1";
  	 String t = "1";
  	 s = "2";
  	 System.out.println(s == t);
  	 System.out.println(s.equals(t));
  	 String ts = s.trim();
  	 String[] n = s.split(" ");
  	 
  	 
  	 //for (String a : n)
  		 //System.out.println(t);
   }
}
