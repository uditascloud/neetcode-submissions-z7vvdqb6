class Solution {
    public int characterReplacement(String s, int k) {
        int low=0;
        int high=0;
        int ans=0;
        if(s.length()==0) return 0;
        int maxFreq=0;
        Map<Character,Integer>mp = new HashMap<>();
        while(high<s.length()){
            Character ch=s.charAt(high);
            int maxLength=high-low+1;
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,mp.get(ch));
            if(maxLength-maxFreq>k){
                mp.put(s.charAt(low),mp.get(s.charAt(low))-1);
                low++;
            }
            ans=Math.max(high-low+1,ans);
            high++;
        }
        return ans;
    }
}
