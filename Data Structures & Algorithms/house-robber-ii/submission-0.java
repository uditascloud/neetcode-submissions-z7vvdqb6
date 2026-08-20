class Solution {

    public int robber(int[] nums, int[] dp, int start, int end){
        if(start>end){
            return 0;
        }
        if(dp[start]!=-1){
            return dp[start];
        }
        int take=nums[start]+robber(nums,dp,start+2,end);
        int notTake=robber(nums,dp,start+1,end);
        return dp[start]=Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int n=nums.length;
    
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int starting_from_0=robber(nums,dp1,0,n-2);
        int starting_from_1=robber(nums,dp2,1,n-1);
        return Math.max(starting_from_0,starting_from_1);

    }
}
