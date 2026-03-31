class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int high=0;
        int longest=0;
        HashMap<Character,Integer>mp=new HashMap<>();
        while(high<s.length()){
            if(!mp.containsKey(s.charAt(high))){
                mp.put(s.charAt(high),high);
              
            }else{
                low=Math.max(low,mp.get(s.charAt(high))+1);
                mp.replace(s.charAt(high),high);
            }
            longest=Math.max(longest,(high-low)+1);
             high++;
        }
        return longest;
    }
}
