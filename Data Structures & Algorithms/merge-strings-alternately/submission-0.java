class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1low=0;
        int w2low=0;
        StringBuilder s = new StringBuilder();
        while(w1low<word1.length() && w2low<word2.length()){
            s.append(word1.charAt(w1low));
            s.append(word2.charAt(w2low));
            w1low++;
            w2low++;
        }
        if(w1low!=word1.length()){
            s.append(word1.substring(w1low,word1.length()));
        }


         if(w2low!=word2.length()){
            s.append(word2.substring(w2low,word2.length()));
        }
        return s.toString();
    }
}