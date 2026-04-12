class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength=s.length();
        int tLength=t.length();
        if(sLength!=t.length()) return false;
        char[] chofS = new char[26];
        char[] chofT = new char[26];
        for(Character c:s.toCharArray()){
            chofS[c-'a']+=1;
        }
        for(Character c:t.toCharArray()){
            chofT[c-'a']+=1;
        }
        return Arrays.equals(chofS,chofT);

    }
}
