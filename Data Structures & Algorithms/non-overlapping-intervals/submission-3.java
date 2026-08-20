class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans= new ArrayList<>();
        ans.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
             int start=intervals[i][0];
             int last=ans.get(ans.size()-1)[1];
             if(start<last){
                ans.get(ans.size()-1)[1]=Math.min(last,intervals[i][1]);
             }
             else {
                ans.add(intervals[i]);
            }
        }
        System.out.println(ans.size());
        return (intervals.length-ans.size());
    }
}
