class Solution {
    public int majorityElement(int[] nums) {
       int cnt=0;
       int number=0;
       for(int itr:nums){
            if(cnt==0){
                number=itr;
            }
            if(itr==number){
                cnt++;
            }else{
                cnt--;
            }

       }
        return number;
    }
}