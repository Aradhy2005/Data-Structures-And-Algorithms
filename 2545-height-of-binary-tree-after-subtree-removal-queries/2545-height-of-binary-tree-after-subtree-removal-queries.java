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
    int dfs(TreeNode root, Map<TreeNode, Integer> heights) {
        if(root == null) return 0;
        heights.put(root, 1 + Math.max(dfs(root.left, heights), dfs(root.right, heights)));
        return heights.get(root);
    }

    void dfs(TreeNode root, int d, int ans, int[] res, Map<TreeNode, Integer> heights) {
        if(root == null) return;
        res[root.val] = ans;
        
        dfs(root.left, d + 1, Math.max(ans, heights.get(root.right) + d), res, heights);
        dfs(root.right, d + 1, Math.max(ans, heights.get(root.left) + d), res, heights);
    }

    public int[] treeQueries(TreeNode root, int[] queries) {
        Map<TreeNode, Integer> heights = new HashMap<>();
        
        
        dfs(root, heights);


        heights.put(null, 0);

        int res[] = new int[heights.size() + 1];
        dfs(root, 0, -1, res, heights);

        int[] ans = new int[queries.length];
        int i = 0;
        for(int query: queries) {
            ans[i++] = res[query];
        }
        return ans;
    }
}