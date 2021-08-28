You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.

 SOLUTION:
	 
	 /**
	  * Definition for a binary tree node.
	  * public class TreeNode {
	  *     int val;
	  *     TreeNode left;
	  *     TreeNode right;
	  *     TreeNode() {}
	  *     TreeNode(int val) { this.val = val; }
	  *     TreeNode(int val, TreeNode left, TreeNode right) {
	  *         this.val = val;
	  *         this.left = left;
	  *         this.right = right;
	  *     }
	  * }
	  */
	 class Solution {
	     public TreeNode insertIntoBST(TreeNode node, int item) {
	      if(node==null)
	      {
	          TreeNode nn =new TreeNode();
	          nn.val=item;
	          return nn;
	      }
	         if(node.val>item)
	         {
	             node.left=insertIntoBST(node.left,item);
	         }
	         else{
	             node.right=insertIntoBST(node.right,item);
	         }
	         return node;
	     }
	 }