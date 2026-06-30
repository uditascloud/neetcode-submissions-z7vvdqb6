class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(Integer itr:nums){
            if(mp.getOrDefault(itr,0)>=1) return true;
            mp.put(itr,mp.getOrDefault(itr,0)+1);
        }
        return false;

    }
}