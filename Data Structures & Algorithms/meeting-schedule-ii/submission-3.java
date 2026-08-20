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
        int minMeetingRoom=Integer.MIN_VALUE;
        int sum=0;
        TreeMap<Integer,Integer>mp = new TreeMap<>();
        for(int i=0;i<intervals.size();i++){
            int first= intervals.get(i).start;
            int second = intervals.get(i).end;
            mp.put(first,mp.getOrDefault(first,0)+1);
            mp.put(second,mp.getOrDefault(second,0)-1);
        }
        for(int vals:mp.values()){
            sum+=vals;
            minMeetingRoom=Math.max(minMeetingRoom,sum);
        }
        return minMeetingRoom;
    }
}
