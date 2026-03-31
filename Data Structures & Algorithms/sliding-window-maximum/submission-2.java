class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[(n-k+1)];
        int low=0;
        int high=0;
        int index=0;
        Deque<Integer>dq=new ArrayDeque<>();
        while(high<n){
            while(!dq.isEmpty() && nums[high]>nums[dq.peekLast()]){
                dq.removeLast();
            }
             dq.addLast(high);
            if((high-low+1)==k){
                ans[index++]=nums[dq.peekFirst()];
                if(low==dq.peekFirst()) dq.removeFirst();
                low++;
            }
           
            high++;

        }
        return ans;
    }
}
