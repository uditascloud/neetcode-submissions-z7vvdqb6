class MedianFinder {
    

    //take two pq. one the left side one will be maxheap to get min element at first and
    //right one will be minheap to get min element at once
    //the diff of size will not be more than 1
    //if more than 1 then resize
    //if same size then its a even length, gor korte hobe
    //otherwise the max size one will have the mediun,

    PriorityQueue<Integer>maxHeap;
    PriorityQueue<Integer>minHeap;
    public MedianFinder() {
        minHeap=new PriorityQueue<>();
        maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || num<maxHeap.peek()){
            maxHeap.offer(num);
        }else{
            minHeap.offer(num);
        }

        if(maxHeap.size()<minHeap.size()-1){
            maxHeap.offer(minHeap.poll());
        }
        if(minHeap.size()<maxHeap.size()-1){
            minHeap.offer(maxHeap.poll());
        }
    }
    
    public double findMedian() {
        double ans=0;
        if(maxHeap.size()>minHeap.size()) return (double)maxHeap.peek();
        else if(maxHeap.size()<minHeap.size()) return (double)minHeap.peek();
        else{
            int first=minHeap.peek();
            int sec=maxHeap.peek();
            ans=(double)(first+sec)/2;
        }
        return ans;
    }
}
