class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] s1_arr= new int[26];
        int[] window=new int[26];
        int low=0;
        int high=0;
        for(int i=0;i<s1.length();i++){
            s1_arr[s1.charAt(i)-'a']++;
        }

        while(high<s2.length()){
            window[s2.charAt(high)-'a']++;
            if((high-low+1)==s1.length()){
                if(Arrays.equals(window,s1_arr)) return true;
                window[s2.charAt(low)-'a']--;
                low++;
            }
            high++;
        }
        return false;
    }
}
