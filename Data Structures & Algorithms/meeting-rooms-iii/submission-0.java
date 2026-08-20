class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int m=meetings.length;
        int[] lastAvailable=new int[n];
        Arrays.fill(lastAvailable,0);
        int[] usageCount = new int[n];
        Arrays.fill(usageCount,0);
        int ans= 0;
        for(int i=0;i<meetings.length;i++){
            boolean ifRoomFound = false;
            int minWaitTime = Integer.MAX_VALUE;
            int nextAvailableRoom = 0;
            int start=meetings[i][0];
            int end=meetings[i][1];
            for(int rooms=0;rooms<n;rooms++){
               
                if(lastAvailable[rooms]<=start){
                    ifRoomFound=true;
                    lastAvailable[rooms]=end;
                    usageCount[rooms]++;
                    break;
                }
                if(lastAvailable[rooms]<minWaitTime){
                    minWaitTime=lastAvailable[rooms];
                    nextAvailableRoom=rooms;
                    
                    
                }


            }

            if(ifRoomFound == false){
                lastAvailable[nextAvailableRoom]+=(end-start);
                usageCount[nextAvailableRoom]++;
            }

        }

    for(int i = 1; i < n; i++){
        if(usageCount[i] > usageCount[ans]){
            ans = i;
        }
}
        return ans;

        
    }
}

