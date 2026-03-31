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

    public int dfs(TreeNode root, int maxValue){
        if(root==null) return 0;
        int cnt=0;
        if(root.val>=maxValue){
                maxValue=root.val;
                cnt=1;
        }
        cnt+=dfs(root.left,maxValue);
        cnt+=dfs(root.right,maxValue);
        return cnt;

    }    
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        int maxValue=Integer.MIN_VALUE;
        return dfs(root,maxValue);
    }
}
