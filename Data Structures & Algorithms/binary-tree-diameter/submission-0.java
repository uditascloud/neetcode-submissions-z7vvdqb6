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
    public int depth(int[] maxD, TreeNode root){
        if(root==null) return 0;
        int leftM=depth(maxD,root.left);
        int rightM=depth(maxD,root.right);
        maxD[0]=Math.max(maxD[0],(leftM+rightM));
        return 1+(Math.max(leftM,rightM));
    }
    public int diameterOfBinaryTree(TreeNode root) {
       int[] maxD = new int[1];
       depth(maxD,root);
       return maxD[0];
    }
}
