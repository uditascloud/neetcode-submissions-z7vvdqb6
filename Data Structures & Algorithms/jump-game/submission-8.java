class Solution {
    public boolean fun(int index,int[]nums,int n,Boolean[] dp){
        if(index==n-1) return true;
        if(dp[index]!=null) return dp[index];
        for(int i=1;i<=nums[index];i++){
            if(fun(index+i,nums,n,dp)){
               dp[index]=true; 
               return true;
            }
        }
        return dp[index]=false;

    }
    public boolean canJump(int[] nums) {
        Boolean [] dp = new Boolean[nums.length+1];
        // Arrays.fill(dp,false);
        boolean ans=fun(0,nums,nums.length,dp);
        return ans;
    }
}
