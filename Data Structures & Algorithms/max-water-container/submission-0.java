class Solution {
    public int maxArea(int[] heights) {
        int area=0;
        int low=0;
        int high=heights.length-1;
        while(low<high){
            int areaVal=Math.min(heights[low],heights[high])*(high-low);
            area=Math.max(area,areaVal);
            if(heights[low]<=heights[high]) {
                low++;
            }
            else {
                high--;
            }
        }
        return area;
    }
}
