class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mp = new HashMap<>();
        int[] ans = new int[k];
        for(Integer itr:nums){
            mp.put(itr,mp.getOrDefault(itr,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> mp.get(b)-mp.get(a));
        pq.addAll(mp.keySet());
        int i=0;
        while(!pq.isEmpty() && k>0){
            ans[i++]=pq.poll();
            k--;
        }
        return ans;
    }
}
