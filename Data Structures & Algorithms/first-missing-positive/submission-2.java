class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean isOnePresent=false;
        int n=nums.length;
        for(int itr:nums){
            if(itr==1){
                isOnePresent=true;
                break;
            }
        }             
        if(isOnePresent==false) return 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>n || nums[i]<=0){
                nums[i]=1;
            }
        }

        for(int i=0;i<n;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]>0) nums[idx]*=-1;
        }                 
        for(int i=0;i<n;i++){
            if(nums[i]>0) return i+1;
        }                            
        return n+1;                                                                           
    }
}

// 1 2 4
// 1 2 1 
//-1 -2 