class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        String currStr="";
        int low=0;
        int high=0;
        while(high<s2.length()){
            currStr+=s2.charAt(high);
            if(currStr.length()>=k){
                char[] arr1=s1.toCharArray();
                Arrays.sort(arr1);
                char[] arr2=currStr.toCharArray();
                Arrays.sort(arr2);
                if(Arrays.equals(arr1,arr2)) return true;
                else{
                  
                    low++;
                
                    currStr=s2.substring(low,high+1);
                    
                }
            }
            high++;
            
        }
        return false;
    }
}
