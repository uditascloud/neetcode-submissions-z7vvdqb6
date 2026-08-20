class Solution {
     int returnRes(char ch, int first, int second) {
        switch (ch) {
            case '+': return first + second;
            case '-': return first - second;
            case '*': return first * second;
            case '/': return first / second;
            default: throw new IllegalArgumentException("Not supported");
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer>st = new Stack<>();
        for(String itr:tokens){
            if(itr.equals("+") || itr.equals("-") || itr.equals("*")||itr.equals("/")){
                int second=st.pop();
                int first = st.pop();
                st.push(returnRes(itr.charAt(0),first,second));
            }else{
                st.push(Integer.parseInt(itr));
            }
        }
        return st.pop();
    }
}
