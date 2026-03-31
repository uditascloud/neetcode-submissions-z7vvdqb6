class Solution {
    public int trap(int[] height) {
       int low=0;
       int high=height.length-1;
       int leftMax=0;
       int rightMax=0;
       int totalWater=0;
       while(low<high){
         leftMax=Math.max(leftMax,height[low]);
         rightMax=Math.max(rightMax,height[high]);
         if(height[low]<=height[high]){
            totalWater+=leftMax-height[low];
            low++;
         }
         else{
            totalWater+=rightMax-height[high];
            high--;
         }
         
       }
       return totalWater; 
    }
}
