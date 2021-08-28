/*Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.*/

class Solution {
    private class BST_pair{
        boolean isBst=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
    }
    public boolean isValidBST(TreeNode root)
    {
        return isValidBST_optimize(root).isBst;
    }
    private BST_pair isValidBST_optimize(TreeNode root) {
        if(root==null)
        {
            return new BST_pair();
        }
        BST_pair lbstp = isValidBST_optimize(root.left);
        BST_pair rbstp = isValidBST_optimize(root.right);
        BST_pair sbstp = new BST_pair();
        if(lbstp.isBst && rbstp.isBst && lbstp.max<root.val && rbstp.min>root.val)
        {
            sbstp.isBst=true;
            sbstp.min=Math.min(lbstp.min,root.val);
            sbstp.max=Math.max(rbstp.max,root.val);
            return sbstp;
        }
        sbstp.isBst=false; 
            sbstp.max=Math.max(rbstp.max,root.val);
            sbstp.min=Math.min(lbstp.min,root.val);
            
        return sbstp;
    }
}


