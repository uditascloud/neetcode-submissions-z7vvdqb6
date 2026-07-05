class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        if(nums.length==0) return ans;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
                if(i>0 && nums[i]==nums[i-1]) continue;
                int low=i+1;
                int high=nums.length-1;
                int sum=0;
                while(low<high){
                        sum=nums[low]+nums[high]+nums[i];
                        // System.out.println(i+" "+low+" "+high+" "+sum);
                        if(sum==0){
                               ans.add(Arrays.asList(nums[i],nums[low],nums[high]));
                               low++;
                               high--;
                               while(low<high && nums[low]==nums[low-1]) low++;
                               while(low<high && nums[high]== nums[high+1]) high--;
                        }
                        else if(sum>0){
                                high--;
                        }else{
                                low++;
                        }
                }
        }
        return ans;
    }
}
