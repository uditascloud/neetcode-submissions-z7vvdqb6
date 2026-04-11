class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>ans = new ArrayList<>();
        if(digits.length()==0) return ans;
         Map<Integer, String> mp = Map.of(
            2, "abc",
            3, "def",
            4, "ghi",
            5, "jkl",
            6, "mno",
            7, "pqrs",
            8, "tuv",
            9, "wxyz"
        );
        StringBuilder str= new StringBuilder();
        findAns(0,digits,str,ans,mp);
        return ans;
    }


    void findAns(int index,String digits, StringBuilder str, List<String>ans, Map<Integer,String>mp){
        if(index==digits.length()){
            ans.add(str.toString());
            return;
        }
        String currStr=mp.get(digits.charAt(index)-'0');
        for(int i=0;i<currStr.length();i++){
            str.append(currStr.charAt(i));
            findAns(index+1,digits,str,ans,mp);
            str.deleteCharAt(str.length()-1);

        }
    }
}
