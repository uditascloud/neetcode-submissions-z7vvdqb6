class Solution {

    void findsubsetsWithDup(int index,int[] nums, List<List<Integer>>result,List<Integer>curr ){
        
      
            result.add(new ArrayList<>(curr));
            

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            findsubsetsWithDup(i+1,nums,result,curr);
            curr.remove(curr.size()-1);

        }
        
        

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        findsubsetsWithDup(0,nums,result,curr);
        return result;
    }
}
