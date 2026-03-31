class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int low=0;
        int high=heights.length-1;
        while(low<high){
            maxWater=Math.max(maxWater,Math.min(heights[low],heights[high])*(high-low));
            if(heights[low]<=heights[high]) low++;
            else high--;
        }   
        return maxWater;
    }
}
