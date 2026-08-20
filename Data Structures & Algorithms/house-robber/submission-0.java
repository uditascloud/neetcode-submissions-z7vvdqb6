class Solution {
    public int findCost(int[] nums, int n, int index, int[] dp){
        if(index>=n) return 0;
        if(dp[index]!=-1){
            return dp[index];
        }
        int pick=nums[index]+findCost(nums,n,index+2,dp);
        int notPicked=findCost(nums,n,index+1,dp);
        return dp[index]=Math.max(pick,notPicked);
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int n=nums.length;
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);
        int ans=findCost(nums,n,0,dp);
        return ans;
    }
}


