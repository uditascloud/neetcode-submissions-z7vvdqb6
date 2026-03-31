class Solution {
    public int largestRectangleArea(int[] heights) {
        int pse = -1;
        int nse= heights.length;
        int area=0;
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                    nse=i;
                    int currBlock=st.pop();
                    pse=(st.isEmpty()) ? -1:st.peek();
                    area=Math.max(area,(nse-pse-1)*heights[currBlock]);
                }
            st.push(i);
         
                
        }
        int h=heights.length;
        while(!st.isEmpty()){
            int curr=heights[st.pop()];
            pse=(st.isEmpty()) ? -1:st.peek();
            area=Math.max(area,(h-pse-1)*curr);
        }
        return area;

    }
}
