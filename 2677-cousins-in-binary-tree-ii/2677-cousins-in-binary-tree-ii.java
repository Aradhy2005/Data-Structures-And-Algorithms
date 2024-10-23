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
class Pair {
    public TreeNode node;
    public int p;
    public Pair(TreeNode node, int p) {
        this.node = node;
        this.p = p;
    }
}
class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<Pair>();
        int sum=0;
        int prevSum=0;
        q.add(new Pair(root,0));
        while(!q.isEmpty()) {
            int n = q.size();
            for(int i=0;i<n;i++) {
                int s = 0;
                Pair nn = q.poll();
                nn.node.val = prevSum - nn.p;
                if(nn.node.left!=null) s+=nn.node.left.val;
                if(nn.node.right!=null) {
                    s+=nn.node.right.val;
                    q.add(new Pair(nn.node.right,s));
                }
                if(nn.node.left!=null) q.add(new Pair(nn.node.left,s));
                sum+=s;
            }
            prevSum = sum;
            sum=0;
        }
        return root;
    }
}