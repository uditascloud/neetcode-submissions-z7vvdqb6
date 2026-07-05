class Solution {
    public int trap(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
        int ans=0;
        while(low<=high){
            leftMax=Math.max(nums[low],leftMax);
            rightMax=Math.max(nums[high],rightMax);
            ans+=(leftMax-nums[low])+(rightMax-nums[high]);
            if(nums[low]<=nums[high]){
                low++;
            }else{
                high--;
            }
        }
        return ans;
    }
}
