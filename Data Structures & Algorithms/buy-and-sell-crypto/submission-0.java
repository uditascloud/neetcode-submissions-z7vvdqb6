class Solution {
    public int maxProfit(int[] prices) {
        int netProfit=0;
        int low=prices[0];
        int high=0;
        while(high<prices.length){
                netProfit=Math.max(netProfit,(prices[high]-low));
                low=Math.min(low,prices[high]);
                high++;
        }
        return netProfit;
    }
}
