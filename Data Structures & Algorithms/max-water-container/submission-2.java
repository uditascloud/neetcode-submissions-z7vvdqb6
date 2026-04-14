class Solution {
    public int maxArea(int[] heights) {
        int low=0;
        int high=heights.length-1;
        int maxHeight=Integer.MIN_VALUE;

        while(low<=high){
            int area=Math.min(heights[low],heights[high])*(high-low);
            maxHeight=Math.max(maxHeight,area);
            if(heights[low]<=heights[high]) low++;
            else high--;
        }
        return maxHeight;
    }
}
