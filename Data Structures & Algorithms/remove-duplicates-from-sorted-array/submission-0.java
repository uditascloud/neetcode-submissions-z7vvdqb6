class Solution {
    public int removeDuplicates(int[] nums) {
        int low=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[low]) {
                nums[low+1]=nums[i];
                low++;
            }
        }
        return low+1;
    }
}