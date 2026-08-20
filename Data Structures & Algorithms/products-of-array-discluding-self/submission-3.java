class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] ans = new int[n];
        int firstProduct=nums[0];
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            
            ans[i]=firstProduct;
            firstProduct*=nums[i];
        }
        int lastProduct=nums[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]*=lastProduct;
            lastProduct*=nums[i];
        }
        return ans;
    }
}  
