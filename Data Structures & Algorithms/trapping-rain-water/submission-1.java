class Solution {
    public int trap(int[] height) {
        // Your code goes here
        int low=0;
        int high=height.length-1;
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
        int ans=0;
        while(low<=high){
            leftMax=Math.max(leftMax,height[low]);
            rightMax=Math.max(rightMax,height[high]);
            ans+=(leftMax-height[low])+(rightMax-height[high]);
            if(height[low]<=height[high]) low++;
            else high--;
        }
        return ans;
    }
}
