class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int itr=0;
        while(itr<=high){
            if(nums[itr]==0){
                swap(nums,itr,low);
                low++;
                itr++;
            }
            else if(nums[itr]==2){
               swap(nums,itr,high);
               high--;
            }else itr++;
        }
    }
    public void swap(int[] nums, int itr, int idx){
        int temp=nums[itr];
        nums[itr]=nums[idx];
        nums[idx]=temp;
    }
}