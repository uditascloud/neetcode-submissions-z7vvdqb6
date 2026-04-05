class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result= new ArrayList<>();
        List<String>curr= new ArrayList<>();
        findPart(0,s,curr,result);
        return result;
    }

    boolean isPalindrom(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    void findPart(int index, String s, List<String> curr,List<List<String>>result){
        if(index==s.length()) {
            result.add(new ArrayList(curr));
            return;
        }

        for(int i=index;i<s.length();i++){
           if(isPalindrom(s,index,i)) {
            curr.add(s.substring(index,i+1));
            findPart(i+1,s,curr,result);
            curr.remove(curr.size()-1);
           }
        }
    }
}
