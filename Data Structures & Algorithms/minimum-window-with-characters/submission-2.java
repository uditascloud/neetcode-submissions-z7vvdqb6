class Solution {
    public String minWindow(String s, String t) {
        int[] arr = new int[256];
        int cnt=0;
        int low=0;
        int high=0;
        int k=t.length();
        int minLength=Integer.MAX_VALUE;
        int startIdex=-1;
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)]++;
        }
        while(high<s.length()){
            char ch=s.charAt(high);
            //if already visisted then increment cnt.
            if(arr[ch]>0) cnt++;
            //else decrement while adding in the map
            arr[ch]--;
            while(cnt==k){
                if(high-low+1<minLength){
                    minLength=high-low+1;
                    startIdex=low;
                }
                arr[s.charAt(low)]+=1;
                if(arr[s.charAt(low)]>0) cnt-=1;
                low++;
            }
            high++;
        }
        if(minLength==Integer.MAX_VALUE) return "";
        return s.substring(startIdex,startIdex+minLength);
    }
}
