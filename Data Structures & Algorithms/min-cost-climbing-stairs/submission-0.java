class Solution {


    public int fun(int index,int[] dp,int[] cost, int n){
        if(index>=n) return 0;
        if(dp[index]!=-1) return dp[index];
        return dp[index]=cost[index]+Math.min(fun(index+1,dp,cost,n),fun(index+2,dp,cost,n));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==2) return Math.min(cost[0],cost[1]);
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int[] dp1 = new int[n];
        Arrays.fill(dp1,-1);
        int first=fun(0,dp,cost,n);
        int second=fun(1,dp1,cost,n);
        return Math.min(first,second);

    }
}
