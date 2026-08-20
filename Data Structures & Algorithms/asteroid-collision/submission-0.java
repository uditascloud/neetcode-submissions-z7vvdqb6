class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer>ans = new ArrayList<>();
        Deque<Integer>dq= new ArrayDeque<>();
        for(int itr:asteroids){
            if(itr>0) dq.addLast(itr);
            else{
                while(!dq.isEmpty() && dq.peekLast()>0 && Math.abs(itr)>dq.peekLast() ){
                    dq.removeLast();
                }
                if(!dq.isEmpty() && Math.abs(itr)==dq.peekLast()) dq.removeLast();
                else if(dq.isEmpty() ||dq.peekLast()<0) dq.addLast(itr);
            }
        }
      return dq.stream().mapToInt(Integer::intValue)
      .toArray();
    }
}