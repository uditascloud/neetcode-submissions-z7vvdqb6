class Solution {
    public int characterReplacement(String s, int k) {
        int low=0;
        int high=0;
        int ans=0;
        int maxOcc=0;
        Map<Character,Integer>mp= new HashMap<>();
        while(high<s.length()){
            Character ch=s.charAt(high);
            int currLength=high-low+1;
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            maxOcc=Math.max(maxOcc,mp.get(ch));
            // if(mp.containsKey(ch)){
                if(currLength-maxOcc > k){
                    mp.put(s.charAt(low),mp.get(s.charAt(low))-1);
                    low++;
                }
            // }
            ans=Math.max(ans,(high-low+1));
            high++;
        }
        return ans;
    }
}
