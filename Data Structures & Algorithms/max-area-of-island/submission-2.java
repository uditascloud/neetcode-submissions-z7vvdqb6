class Solution {


    public static int[][] directions={
        {1,0},
        {0,1},
        {-1,0},
        {0,-1}
    };
    public int bfs(int[][] grid, int row,int col){
        Queue<int[]>q= new LinkedList<>();
        grid[row][col]=0;
        int cnt=1;
        q.add(new int []{row,col});
        while(!q.isEmpty()){
            int[] curr=q.poll();
            for(int[] dirction:directions){
                int newR=dirction[0]+curr[0];
                int newC=dirction[1]+curr[1];
                if(newR>=0 && newC>=0 && newR<grid.length && newC<grid[0].length && grid[newR][newC]==1){
                    grid[newR][newC]=0;
                    q.add(new int []{newR,newC});
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
                    int res=bfs(grid,i,j);
                    ans=Math.max(res,ans);
                }
            }
        }
        return ans;
    }
}
