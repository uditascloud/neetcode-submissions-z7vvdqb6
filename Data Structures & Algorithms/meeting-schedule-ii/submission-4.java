/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size()==0) return 0;
        TreeMap<Integer,Integer>mp = new TreeMap<>();
        int ans=0;
        for(Interval i:intervals){
            int currStart=i.start;
            int currEnd=i.end;
            mp.put(currStart,mp.getOrDefault(currStart,0)+1);
            mp.put(currEnd,mp.getOrDefault(currEnd,0)-1);
        }
        int sum=0;
        for(int vals:mp.values()){
            sum+=vals;
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}


