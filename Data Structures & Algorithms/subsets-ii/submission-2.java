class Solution {

    void findSubset(int index, int[] nums, List<Integer>list, List<List<Integer>>ans){
        
        ans.add(new ArrayList<>(list));
            
        for(int i=index;i<nums.length;i++){
            if(i!=index && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            findSubset(i+1,nums,list,ans);
            list.remove(list.size()-1);

        }
       
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>midAns=new ArrayList<>();
        Arrays.sort(nums);
        findSubset(0,nums,midAns,ans);
       
        return ans;
    }
}
