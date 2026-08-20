class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1_length=s1.length();
        int[] ch = new int[26];
        int[] chs2 = new int[26];
        int low=0;
        int high=0;
        for(char str:s1.toCharArray()){
            ch[str-'a']++;
        }
        while(high<s2.length()){
            chs2[s2.charAt(high)-'a']++;

            if((high-low+1 )> s1_length){
                chs2[s2.charAt(low)-'a']--;
                low++;
            }
            
            if((high-low+1)==s1_length && Arrays.equals(ch,chs2)){
                return true;
            }
            high++;
        }
        return false;
    }
}
