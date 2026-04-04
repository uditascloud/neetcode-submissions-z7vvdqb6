class Solution {





    void findParmu(int index, int[] nums,List<List<Integer>>result){
        if(index==nums.length){
            List<Integer>curr=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                curr.add(nums[i]);
            }
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index;i<nums.length;i++){
           swap(i, index, nums);
            findParmu(index+1,nums,result);
           swap(i, index, nums);
        }
    }

    void swap(int i,int j, int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }



    public List<List<Integer>> permute(int[] nums) {
     // List<Integer>curr=new ArrayList<>();
      List<List<Integer>>result=new ArrayList<>();
     // boolean freq[] = new boolean[nums.length];
      findParmu(0,nums,result);
      return result;   
    }
}
