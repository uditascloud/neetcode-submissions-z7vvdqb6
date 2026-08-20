class Solution {
    // public int findCost(int[] nums, int n, int index, int[] dp){
    //     if(index>=n) return 0;
    //     if(dp[index]!=-1){
    //         return dp[index];
    //     }
    //     int pick=nums[index]+findCost(nums,n,index+2,dp);
    //     int notPicked=findCost(nums,n,index+1,dp);
    //     return dp[index]=Math.max(pick,notPicked);
    // }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int n=nums.length;
        // int[] dp= new int[n+1];
        // dp[0]=nums[0];
        // dp[1]= Math.max(nums[0], nums[1]);
        int first=nums[0];
        int second=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            int picked=nums[i]+first;
            first=second;
            second= Math.max(picked,second);
        }
        return second;
        
    }
}


