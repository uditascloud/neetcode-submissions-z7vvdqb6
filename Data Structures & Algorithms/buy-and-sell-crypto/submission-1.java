class Solution {
    public int maxProfit(int[] prices) {
        int netProfit=0;
        int minPrice=prices[0];
        int high=0;
        while(high<prices.length){
                netProfit=Math.max(netProfit,(prices[high]-minPrice));
                minPrice=Math.min(minPrice,prices[high]);
                high++;
        }
        return netProfit;
    }
}
