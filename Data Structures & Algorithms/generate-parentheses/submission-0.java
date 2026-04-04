class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        bt(0,0,n,str,result);
        return result;
    }

    void bt(int open, int close, int n, StringBuilder str, List<String>result){
        if(open==close && open==n){
            result.add(str.toString());
            return;
        }

        if(open<n){
            str.append('(');
            bt(open+1,close,n,str,result);
            str.deleteCharAt(str.length()-1);

        }
        if(close<open){
            str.append(')');
            bt(open,close+1,n,str,result);
            str.deleteCharAt(str.length()-1);
        }
    }
}
