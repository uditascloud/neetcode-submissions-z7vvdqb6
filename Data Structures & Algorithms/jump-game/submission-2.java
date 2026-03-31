class Solution {
    public boolean canJump(int[] nums) {
        int high=0;
        int n=nums.length;
        int maxIdx=0;
        while(high<n){
            if(maxIdx<high) return false;
            int val=high+nums[high];
            maxIdx=Math.max(maxIdx,val);
            
            high++;
        }
        return true;
    }
}
