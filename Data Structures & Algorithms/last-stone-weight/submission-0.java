class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(Integer i:stones){
            pq.add(i);
        }
        while(pq.size()>1){
            
            int first=pq.poll();
            int second=pq.poll();
            System.out.println(first+" "+second+" "+pq.size());
            if(first==second) continue;
            if(second<first){
                pq.add(first-second);
            }
            System.out.println("new size is"+ pq.size());
        }
        if(pq.size()==0) return 0;
        return pq.peek();

    }
}
