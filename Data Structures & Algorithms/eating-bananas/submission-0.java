class Solution {

    public int findK(int[] piles, int mid){
        int totalHour=0;
        for(Integer i: piles){
            totalHour+=Math.ceil((double)i/mid);
            System.out.println(i+" "+mid+" "+totalHour);
        }
        return totalHour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int ans=Integer.MAX_VALUE;
        int high=Arrays.stream(piles).max().getAsInt();
        int low=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int totalCapacity=findK(piles,mid);
            if(totalCapacity<=h){
                ans=Math.min(mid,ans);
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
