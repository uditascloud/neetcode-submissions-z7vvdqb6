class Solution {
    public String longestCommonPrefix(String[] str) {
        int n=str.length;
        if(n==0) return "";
        if(n==1) return str[0];
        Arrays.sort(str);
        //["flight", "flow", "flower"] ✅ 
        int indexFirst=str[0].length();
        int indexLast=str[n-1].length();
        int i=0;
        while(i<indexFirst && i<indexLast){
            if(str[0].charAt(i) != str[n-1].charAt(i)){
                return str[0].substring(0,i);
            }
            i++;
            
        }
        return str[0].substring(0, i);

        
        
        
    }
}