class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=Integer.MIN_VALUE;
        int low=0;
        int high=0;
        if(s.length()==0) return 0;
        HashMap<Character,Integer> mp = new HashMap<>();
        while(high<s.length()){
            if(mp.containsKey(s.charAt(high))){
                if(mp.get(s.charAt(high))>=low) low=mp.get(s.charAt(high))+1;
            }
            ans=Math.max(ans,(high-low+1));
            mp.put(s.charAt(high),high);
            high++;
        }
        return ans;
    }
}
