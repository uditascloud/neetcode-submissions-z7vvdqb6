class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(Integer itr:nums){
            mp.put(itr,mp.getOrDefault(itr,0)+1);
        }
        for(Integer mpElements:nums){
            if(mp.get(mpElements)>1) return true;
        }
        return false;

    }
}