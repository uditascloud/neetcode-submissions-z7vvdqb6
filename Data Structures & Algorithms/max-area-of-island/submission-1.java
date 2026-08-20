class Solution {
    public static int[][] directions={
        {1,0},
        {0,1},
        {-1,0},
        {0,-1}
    };
    public int findbfs(int[][]grid, int row,int col){
        
        Queue<int[]>q = new LinkedList<>();
        int cnt=1;
        q.offer(new int[]{row,col});
        grid[row][col]=-1;
        while(!q.isEmpty()){

            int[] curr=q.poll();
            for(int[] direction:directions){
            int newR=direction[0]+curr[0];
            int newC=direction[1]+curr[1];
                if(newR>=0 && newC>=0 && newR<grid.length && newC<grid[0].length && grid[newR][newC]==1){
                    q.offer(new int []{newR,newC});
                    grid[newR][newC]=-1;
                    cnt++;
                }
            }
            
        }
        return cnt;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int ans=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    int cnt=findbfs(grid,i,j);
                    ans=Math.max(ans,cnt);
                }
            }
        }
        return ans;
    }
}
