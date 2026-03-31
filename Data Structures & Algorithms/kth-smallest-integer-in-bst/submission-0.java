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

    void doInorder(TreeNode root,List<Integer>nums){
        if(root==null) return;
        doInorder(root.left,nums);
        nums.add(root.val);
        doInorder(root.right,nums);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> allElements= new ArrayList<>();
        doInorder(root,allElements);
        return allElements.get(k-1);
    }
}
