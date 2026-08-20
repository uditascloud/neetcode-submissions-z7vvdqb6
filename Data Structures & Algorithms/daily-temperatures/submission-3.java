class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
        int[] ans= new int [n];
        Arrays.fill(ans,0);
        Stack<Integer> st = new Stack<>();
        int index=0;
        for(int i =0;i<temperatures.length;i++){
            while(!st.empty() && temperatures[st.peek()]<temperatures[i]){
                ans[st.peek()]= i-st.peek();
                index++;
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}
