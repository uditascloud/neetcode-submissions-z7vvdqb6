class Solution {
    public static int[][] directions={
        {1,0},
        {0,1},
        {-1,0},
        {0,-1}
    };
    public static int findbfs(int[][] grid, int[][] ans,Queue<int[]>q, int freshCnt){
        int maxTime=0;
        while(!q.isEmpty()){
            int[] curr= q.poll();
            int currR=curr[0];
            int currC=curr[1];
            int currTime=curr[2];
            maxTime=Math.max(maxTime,currTime);
            for(int[] direction:directions){
                int newR=currR+direction[0];
                int newC=currC+direction[1];
                if(newR>=0 && newC>=0 && newR<grid.length && newC<grid[0].length && ans[newR][newC]==1){
                    ans[newR][newC]=2;
                    q.offer(new int[]{newR,newC,currTime+1});
                    freshCnt--;

                }
            }
           

        }
         if(freshCnt==0) return maxTime;
            return -1;

    }
    public int orangesRotting(int[][] grid) {
       int row=grid.length;
       int col=grid[0].length;
       int[][] ans= new int[row][col];
       Queue<int[]> q= new LinkedList<>();
       int freshCnt=0;
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(grid[i][j]==2){
                q.offer(new int[]{i,j,0});
                ans[i][j]=2;
            }
            if(grid[i][j]==1){
                ans[i][j]=1;
                freshCnt++;
            }
        }
       }

       int res=findbfs(grid,ans,q,freshCnt);
       return res; 
    }
}
