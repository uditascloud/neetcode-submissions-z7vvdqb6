class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean containsOne=false;
        for(int itr:nums){
            if(itr==1){
                containsOne=true;
                break;
            }
        }
        if(containsOne==false) return 1;
        for(int i = 0; i < n; i++){
            if(nums[i] <= 0 || nums[i] > n){
            nums[i] = 1;
        }
}

        for(int i=0;i<n;i++){
            int currIdx=Math.abs(nums[i])-1;
            if(nums[currIdx]>0) nums[currIdx]*=-1;
              
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0) return i+1;
        }
        return n+1;
    }
}