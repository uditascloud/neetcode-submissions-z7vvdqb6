class KthLargest {
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    int maxSize;
    public KthLargest(int k, int[] nums) {
        maxSize=k;
        for(Integer i:nums){
            pq.add(i);
            if(pq.size()>k) pq.poll();
            

        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>maxSize) pq.poll();
        return pq.peek();
        
    }
}
