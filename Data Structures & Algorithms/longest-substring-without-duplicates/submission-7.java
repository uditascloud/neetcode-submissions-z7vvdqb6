class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int high=0;
        int ans=0;
        HashMap<Character,Integer> mp = new HashMap<>();
        while(high<s.length()){
            Character ch =s.charAt(high);
            if(mp.containsKey(ch)){
                if(mp.get(ch)>=low){
                    low=mp.get(ch)+1;
                }
            }
            mp.put(ch,high);
            ans=Math.max(ans,(high-low+1));
            high++;
        }
        return ans;
    }
}
