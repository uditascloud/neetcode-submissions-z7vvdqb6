class Solution {
    void findSubsets(int index,int[] nums, List<Integer>curr,List<List<Integer>>result){
        if(index==nums.length){
            result.add(new ArrayList(curr));
            return;
        }
        curr.add(nums[index]);
        findSubsets(index+1,nums,curr,result);
        curr.remove(curr.size()-1);
        findSubsets(index+1,nums,curr,result);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        findSubsets(0,nums,curr,result);
        return result;
        
    }
}
