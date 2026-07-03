class Solution {
    public int majorityElement(int[] nums) {
        int cnt=1;
        int number=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=number){
                
                if(cnt==0) number=nums[i];
                else cnt--;
            }else{
                cnt++;
            }
        
        }
        return number;
    }
}