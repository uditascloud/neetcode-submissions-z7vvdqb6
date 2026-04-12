class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int number=target-nums[i];
            if(mp.containsKey(number)){
                return new int []{mp.get(number),i};
                
            }
            mp.put(nums[i],i);
        }
        return new int []{-1,-1};

    }
}
// not able to get the syntax for array return + forgot mp.containskey
//was using map.get-- that return a number .. 
//asked in property finder