class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] suffix = new int[n];
        int[] prefix = new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        suffix[n-1]=prefix[n-1];
        int sum=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=prefix[i]*sum;
            sum*=nums[i];
        }
        return suffix;

    }
}  
