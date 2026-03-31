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
    boolean checkIfValid(TreeNode root, int maxVal,int minVal){
        if(root==null) return true;
        if(root.val>=maxVal || root.val<=minVal) return false;
        return (checkIfValid(root.left,root.val,minVal) && checkIfValid(root.right,maxVal,root.val));
    }    
    public boolean isValidBST(TreeNode root) {
        return checkIfValid(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
}
