class Solution {
    public int characterReplacement(String s, int k) {

        if(s.length()==0 || k>s.length()) return s.length();

        Map<Character,Integer>mp = new HashMap<>();
        int maxLength=0;
        int left=0;
        int right=0;
        int maxFreq=0;

        while(right<s.length()){
            mp.put(s.charAt(right),mp.getOrDefault(s.charAt(right),0)+1);
            int length=right-left+1;
            maxFreq=Math.max(maxFreq,mp.get(s.charAt(right)));

            if(length-maxFreq>k){
                mp.put(s.charAt(left),mp.get(s.charAt(left))-1);
                left++;
            }
       
                maxLength=Math.max(maxLength,(right-left+1));
            
            right++;
        }
        return maxLength;
    }
}
