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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;

        return isCheck(root.left,root.right);
        
    }

    public boolean isCheck(TreeNode l, TreeNode r)
    {

        if(l==null && r==null)return true;
        if(l==null || r==null)return false;

        return (l.val==r.val && isCheck(l.left,r.right)&& isCheck(l.right,r.left));

    }
}