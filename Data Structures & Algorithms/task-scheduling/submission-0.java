class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]>q=new LinkedList<>();
        int[] count = new int[26];
        int time=0;
        for(char ch:tasks){
            count[ch-'A']++;
        }
        for(int itr:count){
            if(itr>0){
                pq.offer(itr);
            }
        }

        while(!pq.isEmpty() || !q.isEmpty()){
            time++;
            //Case-1 when nothing in the heap but task waiting in the queur, take the task and jump dirctly to that timestaMP
            if(pq.isEmpty()){
                time=q.peek()[1];
            }//Case-2 task in the heap, if only one instance then no need to push to queue , otherwise put to queue for currentTime+interval for eligibility
            else{
                int currMax=pq.poll()-1;
                if(currMax>0){
                    q.add(new int []{currMax,time+n});
                }
            }
            //check for eligible task for current time stmap and put to query
            if(!q.isEmpty() && q.peek()[1]==time){
                pq.offer(q.poll()[0]);
            }
        }
        return time;
    }
    
}
