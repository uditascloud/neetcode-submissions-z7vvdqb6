class Solution {
   public boolean checkInclusion(String s1, String s2) {
        int[] s1Arr=new int[26];
        int[] s2Arr =new int[26];
        int low=0;
        int high=0;
        int k=s1.length();
        for(int i=0;i<s1.length();i++){
            s1Arr[s1.charAt(i)-'a']++;
        }
        while(high<s2.length()){
            s2Arr[s2.charAt(high)-'a']++;
            if((high-low+1)==k){
                if(Arrays.equals(s1Arr,s2Arr)) return true;
                else{
                    s2Arr[s2.charAt(low)-'a']--;
                    low++;
                }
            }
            high++;
        }
        return false;
    }
}
