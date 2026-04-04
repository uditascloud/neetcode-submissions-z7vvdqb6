class Solution {





    void findParmu(int[] nums,List<Integer>curr, List<List<Integer>>result,boolean[] freq){
        if(curr.size()==nums.length){
            result.add(new ArrayList(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                curr.add(nums[i]);
                findParmu(nums,curr,result,freq);
                curr.remove(curr.size()-1);
                freq[i]=false;

            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
      List<Integer>curr=new ArrayList<>();
      List<List<Integer>>result=new ArrayList<>();
      boolean freq[] = new boolean[nums.length];
      findParmu(nums,curr,result,freq);
      return result;   
    }
}
