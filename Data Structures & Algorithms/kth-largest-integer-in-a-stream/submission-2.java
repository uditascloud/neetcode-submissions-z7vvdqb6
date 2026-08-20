class KthLargest {
    PriorityQueue<Integer>pq;
    int K;
    public KthLargest(int k, int[] nums) {
        pq= new PriorityQueue<>();
        K=k;
        for(int itr:nums){
            pq.offer(itr);
        }
        while(pq.size()>k) pq.poll();
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size()>K) pq.poll();
        return pq.peek();
        
    }
}
