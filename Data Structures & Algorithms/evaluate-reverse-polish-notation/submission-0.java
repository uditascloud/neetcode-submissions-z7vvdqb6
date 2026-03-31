class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(String str:tokens){
            if (str.equals("+")){
                int nums2=st.pop();
                int nums1=st.pop();
                st.push(nums1+nums2);
            }
            else if (str.equals("-")){
                int nums2=st.pop();
                int nums1=st.pop();
                st.push(nums1-nums2);
            }
            else if (str.equals("*")){
                int nums2=st.pop();
                int nums1=st.pop();
                st.push(nums1*nums2);
            }else if (str.equals("/")){
                int nums2=st.pop();
                int nums1=st.pop();
                st.push(nums1/nums2);
            }
            else{
                st.push(Integer.parseInt(str));
            }
        }
        return st.peek();
    }
}
