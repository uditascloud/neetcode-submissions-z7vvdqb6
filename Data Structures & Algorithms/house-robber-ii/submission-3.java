class Solution {
    public int fun(int startIndex, int endIndex,int[]nums, int n){
       
        int dp[] = new int[endIndex-startIndex+1];
        int len = endIndex-startIndex+1;
        dp[0]=nums[startIndex];
        dp[1]=Math.max(nums[startIndex],nums[startIndex+1]);
        for(int i=2;i<len;i++){
            dp[i]=Math.max( (dp[i-2]+nums[startIndex+i]), dp[i-1]);
        }
        return dp[len-1];
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int n=nums.length;
        int first=fun(0,n-2,nums,n);
        int second=fun(1,n-1,nums,n);
        return Math.max(first,second);
    }
}
