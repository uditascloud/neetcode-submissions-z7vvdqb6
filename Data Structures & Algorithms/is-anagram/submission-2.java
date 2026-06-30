class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength=s.length();
        int tLength=t.length();
        if(sLength!=t.length()) return false;
        char[] chofS =s.toCharArray();
        char[] chofT = t.toCharArray();
        // for(Character c:s.toCharArray()){
        //     chofS[c-'a']+=1;
        // }
        // for(Character c:t.toCharArray()){
        //     chofT[c-'a']+=1;
        // }
        Arrays.sort(chofS);
        Arrays.sort(chofT);
        return Arrays.equals(chofS,chofT);

    }
}
