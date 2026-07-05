class Solution {
    public int maxArea(int[] heights) {
       if(heights.length==0) return 0;
       int low=0;
       int high=heights.length-1;
       int ans=Integer.MIN_VALUE;
       while(low<high){
        int minSide=Math.min(heights[low],heights[high]);
        ans=Math.max(ans,((high-low))*minSide);
        if(heights[low]<=heights[high]) low++;
        else high--;
       } 
       return ans;
    }
}
