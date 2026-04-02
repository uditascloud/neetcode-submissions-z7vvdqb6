class Solution {
    void findCombi(int index, int[] nums, int target,List<Integer>curr, List<List<Integer>>result){
        if(index==nums.length || target<0) return;
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        findCombi(index,nums,target-nums[index],curr,result);
        curr.remove(curr.size()-1);
        findCombi(index+1,nums,target,curr,result);


    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>curr =new ArrayList<>();
        Arrays.sort(nums);
        findCombi(0,nums,target,curr,result);
        return result;
    }
}
