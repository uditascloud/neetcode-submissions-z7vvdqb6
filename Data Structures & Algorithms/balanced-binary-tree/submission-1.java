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
    public int findH(TreeNode root){
        if(root==null) return 0;
        int leftS=findH(root.left);
        if(leftS==-1) return -1;
        int rightS=findH(root.right);
        if(rightS==-1) return -1;

        if(Math.abs(leftS-rightS)>1) return -1;
        
        return 1+Math.max(leftS,rightS);
        
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(findH(root)==-1) return false;
        return true;
        
       
        
    }
}
