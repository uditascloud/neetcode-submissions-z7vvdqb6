class Solution {

    void findSubset(int index, int[] nums, List<Integer>list, Set<List<Integer>> st){
        if(index==nums.length){
            st.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        findSubset(index+1,nums,list,st);
        list.remove(list.size()-1);
        findSubset(index+1,nums,list,st);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>midAns=new ArrayList<>();
        Set<List<Integer>>st = new HashSet<>();
        Arrays.sort(nums);
        findSubset(0,nums,midAns,st);
        for(List<Integer>itr:st){
            ans.add(itr);
        }
        return ans;
    }
}
