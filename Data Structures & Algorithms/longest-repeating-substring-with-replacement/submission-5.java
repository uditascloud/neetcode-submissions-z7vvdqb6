class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        if(n<k || n==0) return 0;
        int low=0;
        int high=0;
        Map<Character,Integer>mp= new HashMap<>();
        int maxFreq=0;
        int ans=0;
        while(high<n){
            Character ch=s.charAt(high);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,mp.get(ch));
            int length=high-low+1;
            if(length-maxFreq>k){
                mp.put(s.charAt(low),mp.getOrDefault(s.charAt(low),0)-1);
                low++;
                
            }

            ans=Math.max(ans,(high-low+1));
            high++;
        }
        return ans;

    }
}
