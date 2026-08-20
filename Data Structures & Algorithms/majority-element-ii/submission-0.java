class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;
        int cnt2=0;
        int nums1=Integer.MIN_VALUE;
        int nums2=Integer.MIN_VALUE;
        int n=nums.length;
        List<Integer>ans= new ArrayList<>();
        for(int itr:nums){
            if(cnt1==0 && itr!=nums2){
                cnt1++;
                nums1=itr;
            }
            else if(cnt2==0 && itr!=nums1){
                cnt2++;
                nums2=itr;
            }
            else if(itr==nums1) cnt1++;
            else if(itr==nums2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        int mcnt1=0;
        int mcnt2=0;
        for(int itr:nums){
            if(itr==nums1) mcnt1++;
            else if(itr==nums2) mcnt2++;
        }
        if(mcnt1>n/3) ans.add(nums1);
        if(mcnt2>n/3) ans.add(nums2);

       
        return ans;
    // dry run with tc - 2,1,1,3,1,4,5,6 -> for adding extra check if itr!=nums1 
    // nums=[4,4,4,4,4] - for manual check
    }
}