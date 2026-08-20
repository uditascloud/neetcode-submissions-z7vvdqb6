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
        int ans=Integer.MIN_VALUE;
        if(intervals.size()==0) return 0;
        int curr=0;
        List<int[]>events = new ArrayList<>();
        for(Interval vals:intervals){
            int start=vals.start;
            int end=vals.end;
            events.add(new int[]{start,+1});
            events.add(new int[]{end,-1});

        }
        events.sort((a,b)->
            (a[0]==b[0])?
            Integer.compare(a[1],b[1])
            : Integer.compare(a[0],b[0])
        );
        for(int[] event: events){
            curr+=event[1];
            ans=Math.max(curr,ans);
        }
        return ans;


    }
}
